class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        // 첫 글자인지 판별
        boolean isFirstChar = true;
        
        // 한 글자씩 순회
        for (char c : s.toCharArray()) {
            // 공백일 경우,
            if (c == ' ') {
                sb.append(c); // 그대로 붙이고,
                isFirstChar = true; // 다음 글자를 첫 글자로 인식하도록 isFirstChar 변경
            } else { // 공백 아닐 경우,
                // 단어 첫 글자라면,
                if (isFirstChar) {
                    sb.append(Character.toUpperCase(c)); // 대문자로 변환하여 붙임
                    isFirstChar = false; // 다음 글자부터 소문자
                } else { // 단어 첫 글자 아니라면,
                    sb.append(Character.toLowerCase(c)); // 소문자 변환하여 붙임
                }
            }
        }
        
        return sb.toString();
    }
}