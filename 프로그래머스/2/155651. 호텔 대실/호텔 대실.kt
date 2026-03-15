import kotlin.math.max

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        // 1일 = 1440분
        val rooms = IntArray(1450)
        
        for (book in book_time) {
            val start = timeToMinutes(book[0])
            val end = timeToMinutes(book[1]) + 10 // 퇴실 + 청소 시간(10분) 
            
            rooms[start] += 1
            rooms[end] -= 1
        }
        
        var maxRooms = 0
        var currentRooms = 0
        
        // 0~1449분까지 누적 합 계산 
        for (i in 0 until 1450) {
            currentRooms += rooms[i]
            maxRooms = max(maxRooms, currentRooms) 
        }
        
        return maxRooms
    }
    
    // HH:MM 형식의 문자열 -> 분 단위 정수 변환 
    private fun timeToMinutes(time: String): Int {
        val split = time.split(":")
        val hour = split[0].toInt()
        val minute = split[1].toInt()
        return hour * 60 + minute
    }
}