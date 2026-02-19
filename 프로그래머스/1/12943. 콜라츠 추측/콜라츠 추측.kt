class Solution {
    fun solution(num: Int): Int {
        var n = num.toLong() // 오버플로우 방지 
        var count = 0
        
        while (n != 1L) {
            if (count == 500) return -1 // 500번 시도해도 안되면 
      
            // 짝/홀 처리에 따른 연산 
            n = if (n % 2 == 0L) n / 2 else n * 3 + 1
            
            count++
        }
        
        return count
    }
}