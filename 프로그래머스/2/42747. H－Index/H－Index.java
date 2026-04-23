import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations); // 인용 횟수 -> 오름차순 
        
        int n = citations.length;
        
        // 인용 횟수 적은 논문부터 탐색 
        for (int i = 0; i < n; i++) {
            // H-Index 후보: 현재 논문 포함 인용 횟수 같거나 많은 논문 수 
            int h = n - i;
            
            // 현재 논문 인용 횟수 >= H-Index 후보 
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}