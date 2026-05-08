import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 이미 사용한 단어 저장 => Set
        Set<String> usedWords = new HashSet<>();
        
        // 첫 단어는 무조건 통과
        usedWords.add(words[0]);
        
        // 두 번째 단어부터 끝말잇기 규칙 검사
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1]; // 이전
            String currWord = words[i]; // 현재
            
            // 끝말이 이어지지 않음 or 이미 사용한 단어(중복)라면, 
            if (prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0) || usedWords.contains(currWord)) {
                // 탈락한 사람 번호와 차례
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                
                return new int[]{person, turn};
            }
            
            // 통과한 단어 -> Set에 추가
            usedWords.add(currWord);
        }
        
        // 끝까지 탈락자 없는 경우 -> [0,0]
        return new int[]{0, 0};
    }
}