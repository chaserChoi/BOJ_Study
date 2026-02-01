class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        
        var currentEmptyBottles = n // 현재 보유 중인 빈 병 개수
        
        while (currentEmptyBottles >= a) {
            val exchangeCount = currentEmptyBottles / a // 마트에 가져다 줄 수 있는 단위 횟수
            
            val newBottles = exchangeCount * b // 이번 교환으로 새로 받는 콜라 병 수
            
            val remainBottles = currentEmptyBottles % a // 교환하지 못하고 남은 빈 병 수
            
            answer += newBottles // 총 받은 콜라 수
            
            currentEmptyBottles = remainBottles + newBottles // 다음 턴을 위한 빈 병 개수 갱신 
        }
        
        return answer
    }
}