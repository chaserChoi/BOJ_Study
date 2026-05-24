class Solution {
    public int solution(int n) {
        // n = 1 or 2
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // 초기값
        int prev2 = 1; // DP[1]
        int prev1 = 2; // DP[2]
        int current = 0;
        
        // 3~n 반복, 피보나치 수열 원리
        for (int i = 3; i <= n; i++) {
            // 경우의 수가 기하급수적으로 커짐 => 모듈러 연산 수행
            current = (prev1 + prev2) % 1000000007;
            
            // 다음 단계 위해 이전 값들 한 칸씩 갱신
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}