class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 인덱스에 해당하는 문자 추출 
            
            if (c == 'p' || c == 'P') {
                count++;
            } else if (c == 'y' || c == 'Y') {
                count--;
            }
        }
        
        return count == 0;
    }
}