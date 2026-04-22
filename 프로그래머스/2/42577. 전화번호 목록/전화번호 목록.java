import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        // 모든 전화번호 담기 
        HashSet<String> set = new HashSet<>();
        for (String phone : phone_book) {
            set.add(phone);
        }
        
        // 모든 전화번호 접두어가 Set 있는지 확인
        for (String phone : phone_book) {
            // 본인 전체 문자열과 일치하는 경우는 제외 => length() 전까지 반복
            for (int i = 1; i < phone.length(); i++) {
                // 접두어가 set 존재 => 접두어 포함됨
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true; // 접두어 없음
    }
}