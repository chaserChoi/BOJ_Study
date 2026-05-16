class Solution {
    public String solution(String s) {
        // 공백 기준으로 문자열 잘라 배열로 변환
        String[] numbers = s.split(" ");
        
        // 초기 최솟값, 최댓값 => 배열 첫 번째 값
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        // 두 번째 숫자부터 순회
        for (int i = 1; i < numbers.length; i++) {
            int current = Integer.parseInt(numbers[i]);
            
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        
        return min + " " + max;
    }
}