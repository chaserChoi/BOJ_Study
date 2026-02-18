class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().sumOf { it.digitToInt() }
        
        return x % sum == 0
    }
}