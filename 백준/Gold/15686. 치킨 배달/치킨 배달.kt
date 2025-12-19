import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.min

// 좌표 저장 데이터 클래스
data class Point(val r: Int, val c: Int)

// 전역 변수
lateinit var houses: ArrayList<Point>
lateinit var chickens: ArrayList<Point>
lateinit var isSelected: BooleanArray // 해당 인덱스의 치킨집이 선택되었는지 check
var n = 0
var m = 0
var minCityChickenDist = Int.MAX_VALUE

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    
    houses = ArrayList()
    chickens = ArrayList()
    
    // 지도 입력
    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            val type = st.nextToken().toInt()
            if (type == 1) {
                houses.add(Point(i + 1, j + 1)) // 집 좌표 
            } else if (type == 2) {
                chickens.add(Point(i + 1, j + 1)) // 치킨집 좌표 
            }
        }
    }
    
    // 치킨집 선택 여부 
    isSelected = BooleanArray(chickens.size)
    
    // dfs 이용한 치킨집 m개를 고르는 조합
    dfs(0, 0)
    
    println(minCityChickenDist)
}

/**
 * 백트래킹 메서드 (조합)
 * index = 현재 탐색 중인 치킨집 리스트 인덱스
 * count = 현재까지 선택된 치킨집 개수
 * */
fun dfs(index: Int, count: Int) {
    // m개 치킨집 모두 선택 시
    if (count == m) {
        calculateDist()
        return
    }
    
    // 현재 인덱스부터 탐색
    for (i in index until chickens.size) {
        isSelected[i] = true // i번째 치킨집 선택
        dfs(i + 1, count + 1) // 다음 치킨집 고르기
        isSelected[i] = false // 백트래킹
    }
}

/**
 * 선택된 m개 치킨집 기준으로 도시 치킨 거리 계산 메서드
*/
fun calculateDist() {
    var sum = 0
    
    // 모든 집
    for (house in houses) {
        var minDist = Int.MAX_VALUE
        
        // 선택된 치킨집들과의 거리 중 min
        for (i in chickens.indices) {
            if (isSelected[i]) {
                val dist = abs(house.r - chickens[i].r) + abs(house.c - chickens[i].c)
                minDist = min(minDist, dist)
            }
        }
        
        sum += minDist
        
        // 가지치기
        if (sum >= minCityChickenDist) return
    }
    
    minCityChickenDist = min(minCityChickenDist, sum)
}