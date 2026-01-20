import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 1. 컬럼명 & 배열 인덱스 매핑
        Map<String, Integer> colMap = new HashMap<>();
        colMap.put("code", 0);
        colMap.put("date", 1);
        colMap.put("maximum", 2);
        colMap.put("remain", 3);
        
        // 기준이 되는 컬럼의 인덱스 찾기
        int extIdx = colMap.get(ext);
        int sortIdx = colMap.get(sort_by);
        
        // 필터링 & 정렬 사용 (Stream API)
        return Arrays.stream(data)
            .filter(row -> row[extIdx] < val_ext) // ext 열 값이 val_ext보다 작은 데이터만 필터링
            .sorted((a, b) -> Integer.compare(a[sortIdx], b[sortIdx])) // sort_by 열 값 기준으로 오름차순 정렬
            .toArray(int[][]::new); // 2차원 배열로 변환 (최종)
    }
}