class Solution {
    fun solution(n: Int): String {
        return String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })
    }
}