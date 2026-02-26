import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 중복 제거
        
        for (int num : nums) {
            set.add(num);
        }
        
        // 내가 가져갈 수 있는 최대 폰켓몬 수
        int limit = nums.length / 2;
        
        return Math.min(limit, set.size());
    }
}