class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int startTime = h1 * 3600 + m1 * 60 + s1;
        int endTime = h2 * 3600 + m2 * 60 + s2;
        
        int count = 0;
        
        int startH = startTime % 43200;
        int startM = (startTime * 12) % 43200;
        int startS = (startTime * 720) % 43200;
        
        if (startS == startH || startS == startM) {
            count++;
        }
        
        // 교차점 찾기 
        for (int t = startTime; t < endTime; t++) {
            // 현재 시간(t)의 바늘 위치
            int h1_deg = t % 43200;
            int m1_deg = (t * 12) % 43200;
            int s1_deg = (t * 720) % 43200;
            
            // 1초 뒤(t+1)의 바늘 위치 
            int h2_deg = (t + 1) % 43200 == 0 ? 43200 : (t + 1) % 43200;
            int m2_deg = ((t + 1) * 12) % 43200 == 0 ? 43200 : ((t + 1) * 12) % 43200;
            int s2_deg = ((t + 1) * 720) % 43200 == 0 ? 43200 : ((t + 1) * 720) % 43200;
            
            // 초침이 분침을 추월한 경우 
            if (s1_deg < m1_deg && s2_deg >= m2_deg) {
                count++;
            }
            
            // 초침이 시침을 추월한 경우 
            if (s1_deg < h1_deg && s2_deg >= h2_deg) {
                count++;
            }
            
            // 예외 처리: 12시 정각(43200)처럼 세 바늘이 동시에 겹치는 경우
            if (s2_deg == h2_deg && h2_deg == m2_deg) {
                count--;
            }
        }
        
        return count;
    }
}