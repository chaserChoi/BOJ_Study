class Solution {
    public String solution(int n) {
        // 3으로 나눈 나머지(0, 1, 2)에 직접 매핑
        String[] numbers = {"4", "1", "2"};
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int remainder = n % 3;
            
            // 나머지 해당하는 숫자를 문자열에 추가
            sb.append(numbers[remainder]);
            
            // 다음 자리수를 구하기 위해 n 갱신
            n = (n - 1) / 3;
        }
        
        return sb.reverse().toString();
    }
}