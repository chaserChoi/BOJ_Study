class Solution {
    fun solution(targets: Array<IntArray>): Int {
        // 폭격 미사일들을 끝나는 지점(e) 기준 오름차순
        targets.sortBy{ it[1] }
        
        var answer = 0
        var lastIntercept = -1 // 마지막 요격 미사일 발사한 기준 위치 
        
        // 요격 판단 
        for (target in targets) {
            val s = target[0]
            val e = target[1]
            
            // 현재 미사일 시작점(s) >= 마지막 요격 기준 위치(lastIntercept) 
            if (s >= lastIntercept) {
                answer++
                lastIntercept = e
            }
        }
        
        return answer
    }
}