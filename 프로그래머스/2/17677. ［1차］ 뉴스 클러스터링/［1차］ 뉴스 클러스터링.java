import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 대소문자 차이 무시 => 모두 대문자 변환
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        // 다중집합 저장
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        // str1 다중집합 
        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);
            
            // 두 글자 모두 영문자인 경우만 추가
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                list1.add("" + c1 + c2);
            }
        }
        
        // str2 다중집합
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);
            
            // 두 글자 모두 영문자인 경우만 추가
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                list2.add("" + c1 + c2);
            }
        }
        
        // 교집합 & 합집합 크기 계산
        int intersection = 0;
        int totalSize = list1.size() + list2.size(); // 두 집합 총 원소 수 (교집합 중복 포함)
        
        // list1 원소를 하나씩 확인하며 list2 있는지 검사
        for (String s : list1) {
            // list2에 해당 원소 존재한다면
            if (list2.remove(s)) {
                intersection++; // 교집합 수 증가
            }
        }
        
        // 합집합 = (A + B) - 교집합
        int union = totalSize - intersection;
        
        // 자카드 유사도 계산 & 예외 처리
        // 합집합 = 0
        if (union == 0) {
            return 65536;
        }
        
        // 교집합 / 합집합 * 65536 
        double jaccard = (double) intersection / union;
        return (int) (jaccard * 65536);
    }
}