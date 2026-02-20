class Solution {
    fun solution(n: Int, m: Int): IntArray {
        // 최대공약수
        val gcd = calcGcd(n, m)
        
        // 최소공배수
        val lcm = ((n.toLong() * m) / gcd).toInt()
        
        return intArrayOf(gcd, lcm)
    }
    
    // 최대공약수 함수 
    private tailrec fun calcGcd(a: Int, b: Int): Int {
        return if (b == 0) { // 나누어 떨어지면 
            a
        } else {
            calcGcd(b, a % b)
        }
    }
}