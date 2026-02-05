import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0
        
        for (card in sizes) {
            val w = card[0]
            val h = card[1]
            
            val longerSide = max(w, h)
            val shorterSide = min(w, h)
            
            maxWidth = max(maxWidth, longerSide) // 지갑의 가로
            
            maxHeight = max(maxHeight, shorterSide) // 지갑의 세로 
        }
        
        return maxWidth * maxHeight
    }
}