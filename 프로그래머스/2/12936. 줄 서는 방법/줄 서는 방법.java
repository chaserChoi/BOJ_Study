import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        long factorial = 1;
        
        // 1 ~ n까지 숫자 리스트 담고, n! 값 구하기
        for (int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }
        
        k--; 
        int idx = 0;
        
        while (n > 0) {
            // 블록의 크기
            factorial /= n;
            
            int listIdx = (int) (k / factorial); // 현재 남은 숫자들 중 몇 번째 숫자 뽑아야 하는지 계산
            
            // 해당 숫자를 answer 배열 넣고 리스트에 제거
            answer[idx++] = list.get(listIdx);
            list.remove(listIdx);
            
            // 다음 자리 찾기 위해 
            k %= factorial;
            n--;
        }
        
        return answer;
    }
}