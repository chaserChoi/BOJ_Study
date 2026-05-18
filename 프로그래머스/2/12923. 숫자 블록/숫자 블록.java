class Solution {
    public int[] solution(long begin, long end) {
        // 구간 길이 계산
        int len = (int) (end - begin + 1);
        int[] answer = new int[len];
        
        // 구간 내 각 위치에 대해 블록 번호 구하기
        for (int i = 0; i < len; i++) {
            long pos = begin + i;
            answer[i] = getBlockNumber(pos);
        }
        
        return answer;
    }
    
    /**
    * 특정 위치(pos) 깔릴 블록 번호 계산 메서드
    */
    private int getBlockNumber(long pos) {
        // 1번 위치 = 0
        if (pos == 1) {
            return 0;
        }
        
        int maxDivisor = 1; // 소수일 경우 대비 
        
        for (long i = 2; i * i <= pos; i++) {
            if (pos % i == 0) {
                // 큰 약수
                long largeDivisor = pos / i;
                
                // 천만 이하라면, 
                if (largeDivisor <= 10_000_000) {
                    return (int) largeDivisor; // 더 이상 순회 X
                } else {
                    maxDivisor = Math.max(maxDivisor, (int) i); // 대신 작은 약수(i) 후보로 갱신
                }
            }
        }
        
        return maxDivisor;
    }
}