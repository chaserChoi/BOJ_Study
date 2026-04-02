class Solution {
    fun solution(word: String): Int {
        var answer = 0
        
        // 각 자릿수별로 글자 바뀔 때마다 건너뛰는 가중치 배열 
        val weights = intArrayOf(781, 156, 31, 6, 1)
        val vowels = "AEIOU"
        
        for (i in word.indices) {
            val char = word[i]
            val vowelIndex = vowels.indexOf(char) // A=0, E=1, I=2, O=3, U=4
            
            answer += vowelIndex * weights[i] + 1
        }
        
        return answer
    }
}