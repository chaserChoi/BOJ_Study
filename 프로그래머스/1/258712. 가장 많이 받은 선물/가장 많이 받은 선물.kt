class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val n = friends.size
        
        // 이름 -> 인덱스 매핑
        val friendIdxMap = friends.withIndex().associate { it.value to it.index }
        
        val giftGraph = Array(n) { IntArray(n) } // giftGraph[i][j] = i가 j에게 준 선물 개수
        val giftIndex = IntArray(n) // giftIndex[i] = i의 선물 지수 (준 - 받은)
        
        // 기록
        for (gift in gifts) {
            val (giverName, receiverName) = gift.split(" ")
            val giver = friendIdxMap[giverName]!!
            val receiver = friendIdxMap[receiverName]!!
            
            // 주고 받은 횟수 
            giftGraph[giver][receiver]++
            
            // 선물 지수 계산 (준 사람 +1, 받은 사람 -1)
            giftIndex[giver]++
            giftIndex[receiver]--
        }
        
        // 다음 달 받을 선물 
        val nextMonthGifts = IntArray(n)
        
        // 모든 조합(Pair) 확인
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val giverByI = giftGraph[i][j]
                val giverByJ = giftGraph[j][i]
                
                if (giverByI > giverByJ) {
                    nextMonthGifts[i]++
                } else if (giverByI < giverByJ) {
                    nextMonthGifts[j]++
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthGifts[j]++
                    }
                }
            }
        }
        
        return nextMonthGifts.maxOrNull() ?: 0
    }
}