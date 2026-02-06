class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // 총 필요한 이용료 
        val totalCost: Long = price.toLong() * (count.toLong() * (count + 1) / 2)
        
        // 부족한 금액 
        val shortage = totalCost - money
        
        return if (shortage > 0) shortage else 0
    }
}