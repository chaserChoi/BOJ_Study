class Solution {
    fun solution(record: Array<String>): Array<String> {
        val userMap = HashMap<String, String>()
        
        // 전체 기록 순회하며 유저별 최종 닉네임 갱신
        for (r in record) {
            val parts = r.split(" ")
            val action = parts[0]
            val uid = parts[1]
            
            // Enter or Change -> 닉네임 정보 들어옴 (map update)
            if (action == "Enter" || action == "Change") {
                val nickname = parts[2]
                userMap[uid] = nickname
            }
        }
        
        val answer = mutableListOf<String>()
        
        // 최종 닉네임으로 메시지 생성
        for (r in record) {
            val parts = r.split(" ")
            val action = parts[0]
            val uid = parts[1]
            
            // 해당 UID 최종 닉네임 조회
            when (action) {
                "Enter" -> answer.add("${userMap[uid]}님이 들어왔습니다.")
                "Leave" -> answer.add("${userMap[uid]}님이 나갔습니다.")
                // Change는 메시지 남기지 않음
            }
        }
        
        return answer.toTypedArray()
    }
}