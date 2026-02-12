class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        // 각 스테이지에 머물러 있는 사용자 수 count
        val userCountAtStage = IntArray(N + 2)
        for (stage in stages) {
            userCountAtStage[stage]++
        }
        
        // 실패율 
        val failureRates = ArrayList<Pair<Int, Double>>()
        
        // 현재 스테이지에 도달한 플레이어 수 
        var playersReached = stages.size
        
        for (i in 1..N) {
            val playersStuck = userCountAtStage[i]
            
            // 실패율 
            val rate = if (playersReached == 0) { // 도달한 사람 = 0
                0.0
            } else {
                playersStuck.toDouble() / playersReached
            }
            
            failureRates.add(i to rate)
            
            // 다음 스테이지 도달 인원 갱신 (현재 스테이지 멈춘 사람 제외)
            playersReached -= playersStuck
        }
        
        // 정렬 (실패율 내림차순 -> 스테이지 번호 오름차순)
        failureRates.sortWith(compareByDescending<Pair<Int, Double>> { it.second }
                             .thenBy { it.first })
        
        // 스테이지 번호만 추출 
        return failureRates.map { it.first }.toIntArray()
    }
}