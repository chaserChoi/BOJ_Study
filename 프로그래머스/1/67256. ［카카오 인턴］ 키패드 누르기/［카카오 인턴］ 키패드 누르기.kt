import kotlin.math.abs

class Solution {
    // 키패드 위치 클래스 (행, 열)
    data class Position(val row: Int, val col: Int)
    
    fun solution(numbers: IntArray, hand: String): String {
        val sb = StringBuilder()
        
        var leftPos = Position(3, 0)
        var rightPos = Position(3, 2)
        
        for (num in numbers) {
            val targetPos = getPosition(num) // 눌러야 할 숫자 위치
            
            if (num == 1 || num == 4 || num == 7) { // 무조건 왼손
                sb.append("L")
                leftPos = targetPos
            } else if (num == 3 || num == 6 || num == 9) { // 무조건 오른손
                sb.append("R")
                rightPos = targetPos
            } else { // 가운데 키패드
                val distL = getDistance(leftPos, targetPos)
                val distR = getDistance(rightPos, targetPos)
                
                if (distL < distR) { // 왼손이 가깝다면
                    sb.append("L")
                    leftPos = targetPos
                } else if (distL > distR) { // 오른손이 가깝다면
                    sb.append("R")
                    rightPos = targetPos
                } else { // 거리가 같다면 -> hand(주손) 사용 
                    if (hand == "left") {
                        sb.append("L")
                        leftPos = targetPos
                    } else {
                        sb.append("R")
                        rightPos = targetPos
                    }
                }
            }
        }
        
        return sb.toString()
    }
    
    // 숫자에 해당하는 좌표 반환 
    private fun getPosition(num: Int): Position {
        if (num == 0) return Position(3, 1) // 0 키패드
        
        val row = (num - 1) / 3
        val col = (num - 1) % 3
        return Position(row, col)
    }
    
    // 거리 계산 
    private fun getDistance(p1: Position, p2: Position): Int {
        return abs(p1.row - p2.row) + abs(p1.col - p2.col)
    }
}