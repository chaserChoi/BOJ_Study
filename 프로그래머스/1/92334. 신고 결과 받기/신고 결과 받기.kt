class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        // 유저 Id -> 배열 인덱스로 매핑 (빠른 조회)
        val idIdxMap = id_list.withIndex().associate { it.value to it.index }
        
        // 신고 기록(k: 신고당한 사람, v: 신고한 사람들)
        val reportHistory = HashMap<String, MutableSet<String>>()
        
        for (r in report) {
            val (reporter, reported) = r.split(" ")
            
            val reporters = reportHistory.getOrPut(reported) { mutableSetOf() }
            reporters.add(reporter)
        }
        
        val answer = IntArray(id_list.size)
        
        for ((_, reporters) in reportHistory) {
            if (reporters.size >= k) { // k번 이상 신고 당할 시 
                // 정지된 유저를 신고한 모든 사람들에게 메일 발송
                for (reporter in reporters) { 
                    val idx = idIdxMap[reporter] ?: continue
                    answer[idx]++
                }
            }
        }
        
        return answer
    }
}