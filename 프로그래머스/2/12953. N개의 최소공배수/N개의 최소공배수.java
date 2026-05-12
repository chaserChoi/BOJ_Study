class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        // 두 번째 숫자 ~ 마지막 숫자 순차적으로 최소공배수 누적
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    // 최대공약수 계산 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    // 최소공배수 계산 메서드 
    private int lcm(int a, int b) {
        // 두 수의 곱 / 최대공약수
        return (a * b) / gcd(a, b);
    }
}