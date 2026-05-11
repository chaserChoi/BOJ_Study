import java.util.*;

class Solution
{
    public int solution(String s)
    {
        // 문자 담을 stack
        Deque<Character> stack = new ArrayDeque<>();
        
        // 문자열 순회하며 한 글자씩 확인
        for (char c : s.toCharArray()) {
            // 스택 비어있지 않고, 스택 맨 위 문자 = 현재 문자
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 짝 맞음 -> 스택에 제거
            } else {
                stack.push(c); // 스택에 추가
            }
        }
        
        return stack.isEmpty() ? 1 : 0; // 스택 비어있으면 1, 아님 0
    }
}