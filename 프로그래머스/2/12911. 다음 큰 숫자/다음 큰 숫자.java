class Solution {
    public int solution(int n) {
        // 기준이 되는 n의 2진수 1의 개수
        int targetBitCount = Integer.bitCount(n);
        
        // n보다 큰 자연수부터 1씩 증가시키며 탐색
        int answer = n + 1;
        
        while (true) {
            // 증가시킨 숫자의 2진수 1 개수 = 기준 
            if (Integer.bitCount(answer) == targetBitCount) {
                break; // 정답
            }
            answer++;
        }
        
        return answer;
    }
}