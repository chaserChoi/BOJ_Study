class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전 시간 (붕대 감기 소요 시간)
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        
        int curHealth = health; // 현재 체력
        int maxHealth = health; // 최대 체력
        int lastAttackTime = 0; // 마지막으로 공격받은 시간
        
        // 모든 공격 패턴을 순서대로 처리
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];
            
            // 공격과 공격 사이 시간 차이
            int timeDiff = attackTime - lastAttackTime - 1; // 공격 당하는 순간 회복 X -> -1 
            
            // 시간 차이 있을 경우 -> 회복 진행
            if (timeDiff > 0) {
                int basicHeal = timeDiff * x; // 기본 회복량
                int bonusHeal = (timeDiff / t) * y; // 추가 회복량 (연속 성공 횟수)
                curHealth += basicHeal + bonusHeal;
                
                // 최대 체력 초과 시
                if (curHealth > maxHealth) {
                    curHealth = maxHealth;
                }
            }
            
            // 공격 적용
            curHealth -= damage;
            
            // 사망 여부
            if (curHealth <= 0) {
                return -1;
            }
            
            // 마지막 공격 시간 갱신
            lastAttackTime = attackTime;
        }
        
        return curHealth;
    }
}