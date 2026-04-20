import kotlin.math.min

class Solution {
    fun solution(name: String): Int {
        var answer = 0
        val len = name.length 
        
        var minMove = len - 1 // 기본 커서 이동 횟수
        
        for (i in 0 until len) {
            // 상하 조작 횟수 
            val up = name[i] - 'A'
            val down = 'Z' - name[i] + 1
            answer += min(up, down)
            
            // 좌우 조작 횟수
            var next = i + 1
            while (next < len && name[next] == 'A') {
                next++
            }
            
            // 경로1 - 오른쪽 갔다가 왼쪽으로 돌아가는 경우
            val moveRightThenLeft = i * 2 + (len - next)
            
            // 경로2 - 왼쪽 갔다가 다시 오른쪽으로 돌아가는 경우
            val moveLeftThenRight = (len - next) * 2 + i
            
            // 가장 작은 값 선택 
            minMove = min(minMove, min(moveRightThenLeft, moveLeftThenRight))
        }
        
        return answer + minMove
    }
}