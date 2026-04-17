class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String tree : skill_trees) {
            int skillIndex = 0; // 현재 배워야 할 선행 스킬 위치 
            boolean isValid = true; // 스킬트리 유효성 
            
            for (int i = 0; i < tree.length(); i++) {
                char currentSkill = tree.charAt(i);
                
                // 현재 스킬이 선행 스킬 목록에 포함되어 있는지 확인
                if (skill.indexOf(currentSkill) != -1) {
                    // 포함되어 있다면, 현재 배워야 할 순서의 스킬인지 확인 
                    if (currentSkill == skill.charAt(skillIndex)) {
                        skillIndex++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid) {
                answer++;
            }
        }
        
        return answer;
    }
}