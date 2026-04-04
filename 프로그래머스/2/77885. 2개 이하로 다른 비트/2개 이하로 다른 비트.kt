class Solution {
    fun solution(numbers: LongArray): LongArray {
        return LongArray(numbers.size) { i -> 
            val x = numbers[i]
            
            (x + 1) or ((x xor (x + 1)) ushr 2)
        }
    }
}