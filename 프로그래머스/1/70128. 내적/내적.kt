class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b).sumOf { (numA, numB) -> 
            numA * numB
        }
    }
}