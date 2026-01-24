class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        // 각 문자를 누르기 위한 최소 횟수 저장 맵
        val minKeyStrokes = HashMap<Char, Int>()
        
        // keymap 순회 -> 최소 횟수 계산
        for (key in keymap) {
            for (i in key.indices) {
                val char = key[i]
                val presses = i + 1
                
                // 맵에 없거나, 현재 횟수 < 기존 저장된 횟수
                if (!minKeyStrokes.containsKey(char) || presses < minKeyStrokes[char]!!) {
                    minKeyStrokes[char] = presses
                }
            }
        }
        
        val answer = IntArray(targets.size)
        
        for (i in targets.indices) {
            var sum = 0
            var isPossible = true
            
            for (char in targets[i]) {
                // 맵에 해당 문자 없다면
                if (!minKeyStrokes.containsKey(char)) {
                    isPossible = false
                    break
                }
                // 최소 횟수 누적 합산
                sum += minKeyStrokes[char]!!
            }
            
            // 작성 가능 -> 합계, 불가능 -> -1
            answer[i] = if (isPossible) sum else -1
        }
        
        return answer
    }
}