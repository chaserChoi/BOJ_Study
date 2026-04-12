class Solution {
    fun solution(s: String): IntArray {
        val cleanStr = s.substring(2, s.length - 2) // 앞뒤 "{{", "}}" 잘라냄 
        val sets = cleanStr.split("},{") // "},{" 기준 분리 
        
        val sortedSets = sets.sortedBy { it.length } // 부분 집합 문자열 길이 기준 오름차순 
        
        val answerSet = LinkedHashSet<Int>() // 중복 X, 순서 유지 
        
        for (setStr in sortedSets) {
            val numbers = setStr.split(",") // "," 숫자 문자열 분리 
            
            for (numStr in numbers) {
                answerSet.add(numStr.toInt())
            }
        }
        
        return answerSet.toIntArray()
    }
}