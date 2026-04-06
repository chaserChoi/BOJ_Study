class Solution {
    fun solution(info: Array<String>, query: Array<String>): IntArray {
        val map = HashMap<String, ArrayList<Int>>()
        
        // dfs 기반 지원자 정보로 가능한 16가지 조합 map
        fun makeCombinations(infoTokens: List<String>, key: String, depth: Int) {
            if (depth == 4) { // 4가지 조건 모두 확인 
                val score = infoTokens[4].toInt()
                map.getOrPut(key) { ArrayList() }.add(score) // 해당 조합 키 없으면 -> 리스트 새로 만들고 점수 추가 
                return 
            }
            
            makeCombinations(infoTokens, key + infoTokens[depth], depth + 1) // 현재 조건 포함
            makeCombinations(infoTokens, key + "-", depth + 1) // 현재 조건 고려 X
        }
        
        for (i in info) {
            val tokens = i.split(" ")
            makeCombinations(tokens, "", 0)
        }
        
        // 이분 탐색 -> map에 저장된 모든 점수 리스트 오름차순 
        for (key in map.keys) {
            map[key]!!.sort()
        }
        
        // 특정 점수 이상이 처음으로 등장하는 인덱스 찾는 이분 탐색 fn
        fun lowerBound(list: List<Int>, targetScore: Int): Int {
            var left = 0
            var right = list.size
            
            while (left < right) {
                val mid = left + (right - left) / 2
                
                if (list[mid] >= targetScore) { // 타겟 이상의 점수 
                    right = mid 
                } else { // 타겟 미만의 점수 
                    left = mid + 1
                }
            }
            return left
        }
        
        val answer = IntArray(query.size)
        
        for (i in query.indices) {
            val qTokens = query[i].replace(" and ", "").split(" ")
            val key = qTokens[0]
            val targetScore = qTokens[1].toInt()
            
            if (map.containsKey(key)) {
                val scoreList = map[key]!!
                answer[i] = scoreList.size - lowerBound(scoreList, targetScore)
            } else { // 해당 조건 만족하는 사람 X
                answer[i] = 0
            }
        }
        
        return answer
    }
}