class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i]; // 두 지도 값 -> OR 연산
            
            StringBuilder sb = new StringBuilder();
            
            // 제일 앞자리(n - 1)부터 0번째 자리까지 확인 
            for (int j = n - 1; j >= 0; j--) { // combined를 오른쪽으로 j만큼 밀고, 가장 끝자리 = 1 인 경우 
                if (((combined >> j) & 1) == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}