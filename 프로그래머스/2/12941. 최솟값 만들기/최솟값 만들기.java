import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int n = A.length;
        
        // 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // A는 앞에서부터(가장 작은 수), B는 뒤에서부터(가장 큰 수) 곱하여 누적
        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }
        
        return answer;
    }
}