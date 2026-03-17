class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var answer: Long = 0L
        
        var d_cnt = 0 // 누적된 배달량
        var p_cnt = 0 // 누적된 수거량 
        
        for (i in n - 1 downTo 0) {
            d_cnt += deliveries[i]
            p_cnt += pickups[i]
            
            // 배달 or 수거 중 하나라도 처리해야할 물량 남았을 경우
            while (d_cnt > 0 || p_cnt > 0) {
                d_cnt -= cap
                p_cnt -= cap
                
                answer += (i + 1) * 2L
            }
        }
        
        return answer
    }
}