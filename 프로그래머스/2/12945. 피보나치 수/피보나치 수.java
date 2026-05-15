class Solution {
    public int solution(int n) {
        // F(0) = 0. F(1) = 1
        int prev2 = 0; // F(n - 2)
        int prev1 = 1; // F(n - 1)
        int current = 1; // F(n)
        
        // 2 ~ n
        for (int i = 2; i <= n; i++) {
            // 매 연산마다 오버플로우 방지 
            current = (prev1 + prev2) % 1234567;
            
            // 다음 연산을 위해 이전 값들을 한 칸씩 앞으로 당겨줌
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}