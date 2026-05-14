class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 각 행렬 크기(차원)
        int m = arr1.length; // arr1 행 개수
        int k = arr1[0].length; // arr1 열 개수 = (arr2 행 개수)
        int n = arr2[0].length; // arr2 열 개수
        
        // m x n 크기 2차원 배열 
        int[][] answer = new int[m][n];
        
        for (int i = 0; i < m; i++) { // answer 행렬 i행
            for (int j = 0; j < n; j++) { // answer 행렬 j열
                // arr1 i행 X arr2 j열 => 내적 계산
                for (int l = 0; l < k; l++) {
                    answer[i][j] += arr1[i][l] * arr2[l][j];
                }
                
            }
        }
        
        return answer;
    }
}