class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size <= 1) return intArrayOf(-1) // 배열 길이 =< 1
        
        val min = arr.minOrNull() ?: return intArrayOf(-1) // 가장 작은 수 찾기 
        
        return arr.filter { it != min }.toIntArray() // 최솟값과 같지 않은 원소들만 필터링 
    }
}