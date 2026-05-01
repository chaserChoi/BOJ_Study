class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder(); // 게임 전체 숫자 나열
        
        int maxLen = t * m; // t개 모두 구하기 워해 필요한 전체 문자열 길이
        int num = 0;
        
        // 숫자 0부터 n진수로 변환하여 이어 붙이기 
        while (sb.length() < maxLen) {
            // Integer.toString(숫자, 진법): 진법 변환 가능 
            sb.append(Integer.toString(num++, n).toUpperCase());
        }
        
        StringBuilder answer = new StringBuilder(); // 튜브가 말해야 할 숫자들만 추출
        
        // 튜브의 순서(p)에 맞춰 m칸씩 건너뛰며 문자 추출
        for (int i = 0; i < t; i++) {
            int tubeTurnIndex = (p - 1) + (i * m);
            answer.append(sb.charAt(tubeTurnIndex));
        }
        
        return answer.toString();
    }
}