import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 도착점(n) ~ 시작점(0) 거꾸로 추적
        while (n > 0) {
            // 짝수라면
            if (n % 2 == 0) {
                n /= 2; // 건전지 소모 없이 순간이동 
            } else { // 홀수라면
                n -= 1; // 직전에 1칸 점프 
                ans++;
            }
        }

        return ans;
    }
}