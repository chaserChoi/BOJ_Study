class Solution {
    public int solution(int n) {
        // n = 홀수, 
        if (n % 2 != 0) {
            return 0; // 2칸짜리 타일로 3 x n 영역 채울 수 X
        }
        
        long MOD = 1000000007;
        
        // n = 2, 
        if (n == 2) {
            return 3; // 무조건 3가지 나옴
        }
        
        long prev2 = 1; // DP[0] 
        long prev1 = 3; // DP[2]
        long current = 0;
        
        // 점화식: DP[n] = 4 * DP[n - 2] - DP[n - 4]
        for (int i = 4; i <= n; i += 2) {
            // 모듈러 연산 분배 법칙 & 음수 방지
            current = (4 * prev1 - prev2) % MOD;
            
            // 뺄셈 하다 보면 나머지 = 음수 -> 음수일 경우 MOD 더해 양수로 보정
            if (current < 0) {
                current += MOD;
            }
            
            // 다음 연산을 위한 값 갱신
            prev2 = prev1;
            prev1 = current;
        }
        
        return (int) current;
    }
}