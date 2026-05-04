import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 예외 처리: 캐시 크기 = 0
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        
        // LRU 캐시로 사용할 리스트
        LinkedList<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            // 대소문자 구분X -> 소문자 변환
            String normalizedCity = city.toLowerCase();
            
            // cache hit
            if (cache.remove(normalizedCity)) {
                cache.addLast(normalizedCity); // 가장 최근에 사용 -> 맨 뒤로 이동
                answer += 1;
            }
            // cache miss
            else {
                // 캐시 꽉 찼다면
                if (cache.size() >= cacheSize) {
                    cache.removeFirst(); // 가장 오래된 데이터(맨 앞) 제거
                }
                // 새로운 데이터를 캐시 맨뒤 추가
                cache.addLast(normalizedCity);
                answer += 5;
            }
        }
        
        return answer;
    }
}