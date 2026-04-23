class Solution {
    int answer = 0; // 타겟 넘버 만드는 방법의 수 
    
    public int solution(int[] numbers, int target) {
        // 초기 세팅: index = 0, 초기 합계 0부터 탐색 시작 
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int index, int sum) {
        // 배열 모든 숫자 전부 사용했을 경우
        if (index == numbers.length) {
            // 최종 계산된 합 = target
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        // 재귀 호출: 현재 숫자 더하는 경우 & 빼는 경우 탐색 
        dfs(numbers, target, index + 1, sum + numbers[index]); // 더하는 가지
        dfs(numbers, target, index + 1, sum - numbers[index]); // 빼는 가지 
    }
}