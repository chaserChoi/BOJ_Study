class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        // col번째 컬럼 기준 오름차순, 동일 시 1번째 컬럼 기준 내림차순 
        data.sortWith(Comparator { a, b -> 
            if (a[col - 1] == b[col - 1]) {
                b[0].compareTo(a[0]) // 내림차순
            } else {
                a[col - 1].compareTo(b[col - 1]) // 오름차순 
            }
        })
        
        var hashValue = 0
        
        for (i in row_begin..row_end) {
            var s_i = 0
            val row = data[i - 1] // 실제 배열 접근 -> 0-based index
            
            for (value in row) {
                s_i += value % i
            }
            
            hashValue = hashValue xor s_i
        }
        
        return hashValue
    }
}