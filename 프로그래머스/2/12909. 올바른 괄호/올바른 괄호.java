class Solution {
    boolean solution(String s) {
        int count = 0; // 스택 대신할 카운터 변수 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                count++; // 여는 괄호면 카운터 ++ (push)
            } else {
                count--; // 닫는 괄호면 카운터 -- (pop)
            }
            
            if (count < 0) {
                return false; // 괄호가 먼저 나온 것 => false
            }
        }
        
        return count == 0; // 모든 순회 완료 후 카운터 = 0이면 모든 짝 맞음
    }
}