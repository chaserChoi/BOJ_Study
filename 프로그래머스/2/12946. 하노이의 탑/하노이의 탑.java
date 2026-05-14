class Solution {
    // 전역 인덱스
    private int index = 0;
    private int[][] answer;
    
    public int[][] solution(int n) {
        // n개 원판 옮기는 최소 횟수 
        int moves = (int) Math.pow(2, n) - 1;
        answer = new int[moves][2];
        
        // 하노이 탑 재귀 (n개 원판을 1번(시작)에서 3번(도착)으로 이동)
        hanoi(n, 1, 3, 2);
        
        return answer;
    }
    
    private void hanoi(int n, int start, int end, int mid) {
        // 원판이 1개 남았을 경우, 
        if (n == 1) {
            answer[index++] = new int[]{start, end}; // 목표 기동으로 바로 옮김
            return;
        }
        
        // 제일 큰 원판 옮기기 위해, 위에 있는 n - 1개 원판 -> 보조 기둥(mid)로 이동
        hanoi(n - 1, start, mid, end);
        
        // 제일 큰 원판(n) -> 목표 기둥(end)
        answer[index++] = new int[]{start, end};
        
        // 보조 기둥에 있는 n - 1개 원판 -> 목표 기둥으로 이동
        hanoi(n - 1, mid, end, start);
    }
}