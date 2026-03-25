class Solution {
    fun solution(cards: IntArray): Int {
        val n = cards.size
        val visited = BooleanArray(n)
        val groupSizes = mutableListOf<Int>()
        
        for (i in 0 until n) {
            // 아직 열리지 않은 상자라면 -> 탐색 시작 
            if (!visited[i]) {
                var current = i
                var count = 0
                
                // 이미 열려있는 상자 만날 때까지 반복 
                while (!visited[current]) {
                    visited[current] = true // 상자 열기 = 방문 처리
                    current = cards[current] - 1 // 다음 상자 이동
                    count++ // 그룹 내 상자 개수 ++
                }
                
                groupSizes.add(count)
            }
        }
        
        // 그룹이 1개뿐이라면 
        if (groupSizes.size <= 1) {
            return 0
        }
        
        groupSizes.sortDescending()
        return groupSizes[0] * groupSizes[1]
    }
}