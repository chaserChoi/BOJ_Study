class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        // 최댓값, 최솟값
        var lux = Int.MAX_VALUE
        var luy = Int.MAX_VALUE
        var rdx = Int.MIN_VALUE
        var rdy = Int.MIN_VALUE
        
        // 2차원 배열 전체 순환
        for (i in wallpaper.indices) {
            for (j in wallpaper[i].indices) {
                // 파일('#') 발견한 경우 좌표 갱신
                if (wallpaper[i][j] == '#') {
                    // 시작점: 가장 작은 인덱스
                    if (i < lux) lux = i
                    if (j < luy) luy = j
                    
                    // 끝점: 가장 큰 인덱스 + 1 찾기
                    if (i + 1 > rdx) rdx = i + 1
                    if (j + 1 > rdy) rdy = j + 1
                }
            }
        }
        
        return intArrayOf(lux, luy, rdx, rdy)
    }
}