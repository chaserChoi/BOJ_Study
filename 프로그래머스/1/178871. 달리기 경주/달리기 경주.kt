class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        // key: 선수 이름 - value: 현재 등수(0~)
        val rankMap = HashMap<String, Int>()
        
        // 초기 등수 저장
        players.forEachIndexed { index, player -> 
            rankMap[player] = index
        }
        
        // 해설진이 부른 순서대로 처리
        for (call in callings) {
            // 불린 선수 현재 등수 가져오기
            val currentRank = rankMap[call]!!
            
            // 1등 불리지 않음 -> 항상 앞 선수 존재
            val frontRank = currentRank - 1
            val frontPlayer = players[frontRank]
            
            // swap (배열)
            players[frontRank] = call // 앞 자리 불린 선수
            players[currentRank] = frontPlayer // 뒷 자리에 원래 앞 선수 넣기
            
            // swap (Map)
            rankMap[call] = frontRank
            rankMap[frontPlayer] = currentRank
        }
        
        return players
    }
}