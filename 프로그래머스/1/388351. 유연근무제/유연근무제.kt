class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer: Int = 0
        
        // 각 직원별 순회
        for (i in schedules.indices) {
            val desiredTime = schedules[i]
            
            // 인정 가능 마감 시간 계산
            var deadline = desiredTime + 10
            if (deadline % 100 >= 60) {
                deadline += 40
            }
            
            var isRewardable = true // 상품 수령 가능 여부
            
            // 1주간 기록 확인
            for (dayIdx in 0 until 7) {
                // 현재 요일 계산
                val currentDayOfWeek = (startday + dayIdx - 1) % 7 + 1
                
                // 주말은 검사 제외
                if (currentDayOfWeek == 6 || currentDayOfWeek == 7) {
                    continue
                }
                
                // 평일에 실제 출근 시간이 마감보다 늦으면 탈락
                if (timelogs[i][dayIdx] > deadline) {
                    isRewardable = false
                    break
                }
            }
            
            // 지각 없었다면
            if (isRewardable) {
                answer++
            }
        }
        
        return answer
    }
}