import java.util.TreeMap
import kotlin.math.ceil

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val basicTime = fees[0]
        val basicFee = fees[1]
        val unitTime = fees[2]
        val unitFee = fees[3]
        
        val inTimeMap = mutableMapOf<String, Int>() // 입차 시간 (key=차량번호, value=입차 시간)
        val totalTimeMap = TreeMap<String, Int>() // 누적 주차 시간 (key=차량번호, value=누적 주차 시간)
        
        // 입출차 기록 파싱, 시간 누적 
        for (record in records) {
            val parts = record.split(" ")
            val timeString = parts[0]
            val carNum = parts[1]
            val status = parts[2]
            
            // HH:MM -> 분 변환 
            val timeParts = timeString.split(":")
            val minutes = timeParts[0].toInt() * 60 + timeParts[1].toInt()
            
            if (status == "IN") {
                inTimeMap[carNum] = minutes
            } else {
                val inTime = inTimeMap.remove(carNum)!!
                val duration = minutes - inTime
                totalTimeMap[carNum] = totalTimeMap.getOrDefault(carNum, 0) + duration
            }
        }
        
        // 23:59까지 출차하지 않은 차량 처리 
        val endOfDay = 23 * 60 + 59
        for ((carNum, inTime) in inTimeMap) {
            val duration = endOfDay - inTime
            totalTimeMap[carNum] = totalTimeMap.getOrDefault(carNum, 0) + duration
        }
        
        // 차량별 주차 요금 계산 
        val answer = IntArray(totalTimeMap.size)
        var idx = 0
        
        for ((carNum, totalTime) in totalTimeMap) {
            if (totalTime <= basicTime) {
                answer[idx] = basicFee
            } else {
                val extraTime = totalTime - basicTime
                val extraPeriods = ceil(extraTime.toDouble() / unitTime).toInt() 
                answer[idx] = basicFee + extraPeriods * unitFee
            }
            idx++
        }
        
        return answer
    }
}