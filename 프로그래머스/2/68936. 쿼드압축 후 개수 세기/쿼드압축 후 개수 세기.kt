class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        var answer = IntArray(2)
        
        // 특정 영역 검사 & 압축 fn
        fun compress(r: Int, c: Int, size: Int) {
            val first = arr[r][c]
            var isUniform = true
            
            for (i in r until r + size) {
                for (j in c until c + size) {
                    if (arr[i][j] != first) { // 현재 영역이 다른 값이라면 
                        isUniform = false
                        break
                    }
                }
                
                if (!isUniform) break
            }
            
            // 모두 같은 값 -> 압축 완료 
            if (isUniform) {
                answer[first]++
                return
            }
            
            // 값 섞여 있다면 -> 4개 영역으로 분할 정복
            val newSize = size / 2
            
            compress(r, c, newSize) // 좌상
            compress(r, c + newSize, newSize) // 우상
            compress(r + newSize, c, newSize) // 좌하
            compress(r + newSize, c + newSize, newSize) // 우하 
        }
        
        compress(0, 0, arr.size)
        
        return answer
    }
}