import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).sumOf { i -> 
            val root = sqrt(i.toDouble()).toInt()
            
            if (root * root == i) {
                -i
            } else {
                i
            }
        }
    }
}