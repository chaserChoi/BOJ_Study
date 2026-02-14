import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // key: 이름 - value: 인원 수 
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 명단 -> Map 넣기 (+ 동명이인 처리)
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 완주자 명단 -> Map에서 제거 
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // 완주하지 못한 선수(value != 0) 찾기 
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}