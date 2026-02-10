class Solution {
    fun solution(numbers: IntArray): IntArray {
        val tempSet = mutableSetOf<Int>()
        
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                tempSet.add(numbers[i] + numbers[j])
            }
        }
        
        return tempSet.sorted().toIntArray()
    }
}