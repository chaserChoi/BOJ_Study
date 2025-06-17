import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> st = new Stack<>();
        
        for (int i : arr) {
            if (st.isEmpty()) st.push(i);
            else if (st.peek() != i) st.push(i);
        }
        
        answer = new int[st.size()];
        
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        
        return answer;
    }
}