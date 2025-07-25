import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            
            if (k < pq.size()) {
                pq.poll();
            }
            
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}