import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt()
    
    /**
     * dp 배열
     * 메모리 절약 => 현재 상태 저장할 배열만 유지 (크기 = 3)
     * */
    val maxDp = IntArray(3)
    val minDp = IntArray(3)
    
    // 첫 번째 줄
    var st = StringTokenizer(br.readLine())
    val n0 = st.nextToken().toInt()
    val n1 = st.nextToken().toInt()
    val n2 = st.nextToken().toInt()
    
    maxDp[0] = n0
    maxDp[1] = n1
    maxDp[2] = n2
    
    minDp[0] = n0
    minDp[1] = n1
    minDp[2] = n2
    
    // 2 ~ n 번째 줄 
    for (i in 1 until n) {
        st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        val z = st.nextToken().toInt()
        
        // 이전 단계 값들 임시 변수에 저장
        val prevMax0 = maxDp[0]
        val prevMax1 = maxDp[1]
        val prevMax2 = maxDp[2]
        
        val prevMin0 = minDp[0]
        val prevMin1 = minDp[1]
        val prevMin2 = minDp[2]
        
        // max 갱신
        maxDp[0] = max(prevMax0, prevMax1) + x // 위(0) & 오른쪽 위(1) 중 max + 현재 값
        maxDp[1] = max(prevMax0, max(prevMax1, prevMax2)) + y // 왼쪽 위(0) & 위(1) & 오른쪽 위(2) 중 max + 현재 값
        maxDp[2] = max(prevMax1, prevMax2) + z // 왼쪽 위(1) & 위(2) 중 max + 현재 값
        
        // min 갱신
        minDp[0] = min(prevMin0, prevMin1) + x
        minDp[1] = min(prevMin0, min(prevMin1, prevMin2)) + y
        minDp[2] = min(prevMin1, prevMin2) + z
    }
    
    // result
    val maxResult = max(maxDp[0], max(maxDp[1], maxDp[2]))
    val minResult = min(minDp[0], min(minDp[1], minDp[2]))
    
    println("$maxResult $minResult")
}
