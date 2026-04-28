import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 경과 시간
        int currentWeight = 0; // 현재 다리 위에 있는 트럭들의 총 무게
        Queue<Integer> bridge = new LinkedList<>(); // 다리 표현하는 큐
        
        for (int truck : truck_weights) {
            // 현재 트럭이 다리에 올라갈 때까지 무한 반복
            while (true) {
                
                // 다리에 트럭 꽉차서 끝에 도달한 경우, 
                if (bridge.size() == bridge_length) {
                    // 다리 다 건넜으므로 큐에서 빼고 무게 차감
                    currentWeight -= bridge.poll();
                }
                
                // 다음 트럭이 다리에 올라갈 수 있는 경우,
                if (currentWeight + truck <= weight) {
                    bridge.offer(truck); // 다리에 트럭 진입
                    currentWeight += truck; // 다리 위 총 무게 증가
                    answer++; // 1초 +
                    break; // 다음 트럭 확인하기 위한 반복문 탈출
                } // 다음 트럭 올라갈 수 없는 경우  
                else {
                    bridge.offer(0); // 빈 공간(0) 넣어 다리 위 트럭들 1칸 전진
                    answer++; // 1초 +
                }
            }
        }
        
        return answer + bridge_length;
    }
}