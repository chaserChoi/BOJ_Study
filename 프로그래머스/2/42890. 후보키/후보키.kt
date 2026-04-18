class Solution {
    fun solution(relation: Array<Array<String>>): Int {
        val rows = relation.size
        val cols = relation[0].size
        val candidateKeys = mutableListOf<Int>()

        val combinations = (1 until (1 shl cols)).sortedBy { it.countOneBits() }

        for (mask in combinations) {
            // 2. 최소성 검사
            var isMinimal = true
            for (key in candidateKeys) {
                if ((mask and key) == key) {
                    isMinimal = false
                    break
                }
            }
            if (!isMinimal) continue 

            // 유일성 검사
            val uniqueSet = HashSet<String>()
            for (r in 0 until rows) {
                val sb = StringBuilder()
                for (c in 0 until cols) {
                    // 현재 마스크에 c번째 컬럼이 포함되어 있다면
                    if ((mask and (1 shl c)) != 0) {
                        sb.append(relation[r][c]).append(",")
                    }
                }
                uniqueSet.add(sb.toString())
            }

            // 유일성 만족
            if (uniqueSet.size == rows) {
                candidateKeys.add(mask)
            }
        }

        return candidateKeys.size
    }
}