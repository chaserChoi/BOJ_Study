class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        
        var paintedUntil = 0 // 현재까지 칠해진 벽의 마지막 위치 변수
        
        for (target in section) {
            // 현재 구역(target) 이미 칠해진 범위보다 오른쪽에 있다면 (아직 안 칠해짐)
            if (target > paintedUntil) {
                answer++
                
                // 새로운 칠하기 수행
                paintedUntil = target + m - 1 // 칠해진 마지막 위치
            }
        }
        
        return answer
    }
}