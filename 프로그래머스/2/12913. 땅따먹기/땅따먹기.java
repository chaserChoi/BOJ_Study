class Solution {
    int solution(int[][] land) {
        // 두 번째 행(index = 1) ~ 마지막 행 순회
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }
        
        // 마지막 행에 누적된 4개의 값 중 max 찾기
        int lastRow = land.length - 1;
        int answer = Math.max(
            Math.max(land[lastRow][0], land[lastRow][1]), 
            Math.max(land[lastRow][2], land[lastRow][3])
        );

        return answer;
    }
}