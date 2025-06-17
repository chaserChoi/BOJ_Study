import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] scoville, int K) {
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) 
            pq.add(scoville[i]);
        
        while (pq.peek() < K) {
            if (pq.size() <= 1) break;
            
            int min = pq.poll();
            int mixed = min + (pq.poll() * 2);
            pq.add(mixed);
            answer++;
            
            if (pq.peek() >= K) break;
        }
        
        if (pq.peek() < K)
            answer = -1;
        
        return answer;
    }
}