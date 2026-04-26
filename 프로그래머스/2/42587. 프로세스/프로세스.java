import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 1
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 2
        for (int p : priorities) {
            pq.offer(p);
        }
        
        // 3
        while (!pq.isEmpty()) {
            
            // 배열 순회하면서 큐 꺼내고 뒤로 넣기
            for (int i = 0; i < priorities.length; i++) {
                
                // 현재 검사 중인 프로세스 중요도가 남은 프로세스 중 최고 중요도라면 
                if (priorities[i] == pq.peek()) {
                    pq.poll(); // 해당 중요도 제거
                    answer++; // 실행 순서 증가
                    
                    // 방금 실행한 프로세스 = 내가 찾던 프로세스 
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}