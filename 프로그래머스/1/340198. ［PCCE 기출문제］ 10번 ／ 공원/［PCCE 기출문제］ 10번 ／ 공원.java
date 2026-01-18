import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 돗자리 오름차순 정렬
        Arrays.sort(mats);
        
        int rows = park.length;
        int cols = park[0].length;
        
        // 가장 큰 돗자리부터 확인하기 위해 뒤부터 순회
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            
            // 돗자리를 놓을 수 있는 모든 시작점(좌측 상단) 탐색
            for (int r = 0; r <= rows - size; r++) {
                for (int c = 0; c <= cols - size; c++) {
                    // 해당 위치(r, c)에 size 크기의 돗자리 놓을 수 있다면 => 해당 크기(size) 반환 
                    if (canPlaceMat(park, r, c, size)) {
                        return size; 
                    }
                }
            }
        }
        
        return -1; // 어떤 돗자리 놓을 수 없는 경우
    }
    
    // 특정 위치(r, c)에서 size 만큼의 정사각형 영역이 모두 비어있는지 확인 메서드
    private boolean canPlaceMat(String[][] park, int r, int c, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // "-1" 아닌 곳(사람 있는 곳)이 하나라도 있다면
                if (!park[r + i][c + j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
