import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        // int[] -> String[]
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // 커스텀 정렬 (내림차순)
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
        
        // 예외 처리: 정렬 후 맨 앞 숫자가 "0"인 경우 -> 모든 숫자 0임
        if (strNumbers[0].equals("0")) {
            return "0";
        }
        
        // 정렬된 문자열 -> StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String str : strNumbers) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}