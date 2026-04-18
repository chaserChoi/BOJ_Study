class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        
        // dfs fn
        fun dfs(index: Int, currentSum: Int): Int {
            // 배열의 모든 숫자 전부 사용 시,
            if (index == numbers.size) {
                return if (currentSum == target) 1 else 0 // 최종 계산된 합 = target 수 -> 1가지 방법 찾음 
            }
            
            val plusBranch = dfs(index + 1, currentSum + numbers[index]) // 현재 숫자 더하는 경우 
            val minusBranch = dfs(index + 1, currentSum - numbers[index]) // 현재 숫자 빼는 경우 
            
            return plusBranch + minusBranch
        }
        
        return dfs(0, 0)
    }
}