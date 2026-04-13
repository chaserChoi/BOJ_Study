class Solution {
    fun solution(w: Int, h: Int): Long {
        val wl = w.toLong()
        val hl = h.toLong()
        
        val totalSquares = wl * hl // 전체 사각형 개수
        
        val brokenSquares = wl + hl - gcd(w, h) // 대각선 지나가면서 망가지는 사각형 개수 
        
        return totalSquares - brokenSquares // 멀쩡한 사각형 개수 
    }
    
    // 최대공약수 fun 
    private tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}