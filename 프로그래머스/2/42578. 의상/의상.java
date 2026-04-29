import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 종류별 옷 개수 해시맵
        Map<String, Integer> map = new HashMap<>();
        
        // clothes 배열 순회하여 종류별로 개수 카운트
        for (String[] cloth : clothes) {
            String type = cloth[1]; // 의상 종류
            map.put(type, map.getOrDefault(type, 0) + 1); // 기존에 있던 종류 -> +1 | 처음 보는 종류 -> 0 + 1
        }
        
        // 조합
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1); // (해당 종류 옷 개수 + 안입는 경우 1)
        }
        
        return answer - 1; // 모든 종류 옷 하나도 입지 않은 경우(1가지) 제외함
    }
}