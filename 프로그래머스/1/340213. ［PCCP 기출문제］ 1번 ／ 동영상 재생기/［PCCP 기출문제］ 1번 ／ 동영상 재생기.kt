class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        // 시간 -> 초 단위 정수
        val totalLenSec = parseToSeconds(video_len)
        var currentPosSec = parseToSeconds(pos)
        val opStartSec = parseToSeconds(op_start)
        val opEndSec = parseToSeconds(op_end)
        
        // 오프닝 구간인지 확인하고 건너뛰는 함수
        fun skipOpening() {
            if (currentPosSec in opStartSec..opEndSec) {
                currentPosSec = opEndSec
            }
        }
        
        // 명령 수행 전 최기 위치가 오프닝인지 확인
        skipOpening()
        
        // 명령어 처리
        for (cmd in commands) {
            when (cmd) {
                "prev" -> {
                    currentPosSec -= 10
                    if (currentPosSec < 0) currentPosSec = 0
                }
                "next" -> {
                    currentPosSec += 10
                    if (currentPosSec > totalLenSec) currentPosSec = totalLenSec
                }
            }
            
            skipOpening() // 이동 후 오프닝인지 확인
        }
        
        // 정수 -> "mm:ss"
        return formatToTime(currentPosSec)
    }
    
    // "mm:ss" -> 초(Int)
    private fun parseToSeconds(time: String): Int {
        val (mm, ss) = time.split(":").map { it.toInt() }
        return mm * 60 + ss
    }
    
    // 초(Int) -> "mm:ss"
    private fun formatToTime(seconds: Int): String {
        val mm = seconds / 60
        val ss = seconds % 60
        return "%02d:%02d".format(mm, ss)
    }
}