import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var totalWeight = 0
        
        for (knight in 1..number) {
            var count = 0
            val sqrtVal = sqrt(knight.toDouble()).toInt()
            
            for (i in 1..sqrtVal) {
                if (knight % i == 0) {
                    count++
                    
                    if (i * i != knight) {
                        count++
                    }
                }
            }
            
            if (count > limit) {
                totalWeight += power
            } else {
                totalWeight += count
            }
        }
        
        return totalWeight
    }
}