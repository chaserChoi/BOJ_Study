class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val countMap = HashMap<Int, Int>() // 크기별 귤 개수 
        for (size in tangerine) {
            countMap[size] = countMap.getOrDefault(size, 0) + 1
        }
        
        // 빈도수 기준 내림차순 
        val counts = countMap.values.sortedDescending()
        
        var answer = 0
        var sum = 0
        
        for (count in counts) {
            sum += count // 상자에 담은 귤 누적 
            answer++ // 귤 종류 수 증가 
            
            // 담은 귤 수 >= k
            if (sum >= k) {
                break
            }
        }
        
        return answer
    }
}