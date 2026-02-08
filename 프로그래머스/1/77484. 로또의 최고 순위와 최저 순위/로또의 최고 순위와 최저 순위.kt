class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        // index = 맞은 개수, value = 등수
        val rankMap = intArrayOf(6, 6, 5, 4, 3, 2, 1)
        
        val zeroCount = lottos.count { it == 0 }
        val matchCount = lottos.count { it in win_nums }
        
        return intArrayOf(rankMap[matchCount + zeroCount], rankMap[matchCount])
    }
}