class Solution {
    fun solution(food: IntArray): String {
        val sb = StringBuilder()
        
        // 왼쪽 절반 문자열
        for (i in 1 until food.size) {
            val count = food[i] / 2 // 해당 음식을 한 선수가 먹을 수 있는 개수
            
            // 개수만큼 음식 번호 붙이기
            repeat(count) {
                sb.append(i)
            }
        }
        
        // 대칭 구조 합치기
        val leftSide = sb.toString()
        
        return leftSide + "0" + leftSide.reversed()
    }
}