import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // 사전 초기화
        Map<String, Integer> dictionary = new HashMap<>();
        int dictIndex = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dictionary.put(String.valueOf(c), dictIndex++);
        }
        
        List<Integer> answers = new ArrayList<>();
        int i = 0;
        int n = msg.length();
        
        // 문자열 처음부터 끝까지 압축
        while (i < n) {
            int j = i + 1; // 부분 문자열 끝 index
            
            // 사전에 존재하는 가장 긴 문자열 찾기
            while (j <= n && dictionary.containsKey(msg.substring(i, j))) {
                j++;
            }
            
            // msg.substring 사전에 없다면 
            answers.add(dictionary.get(msg.substring(i, j - 1)));
            
            // 처리되지 않은 다음 글자(c) 남아 있다면 
            if (j <= n) {
                dictionary.put(msg.substring(i, j), dictIndex++); // 새로운 단어(w+c) 사전에 등록 
            }
            
            i = j - 1; // index 이동 
        }
        
        int[] answer = new int[answers.size()];
        for (int k = 0; k < answers.size(); k++) {
            answer[k] = answers.get(k);
        }
        
        return answer;
    }
}