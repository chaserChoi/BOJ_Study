import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
 * Boj 1043 - 거짓말
 */
lateinit var parent: IntArray

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    val n = st.nextToken().toInt() // 사람 수
    val m = st.nextToken().toInt() // 파티 수
    
    // 부모 배열
    parent = IntArray(n + 1) { it }
    
    // 진실을 아는 사람 정보
    st = StringTokenizer(br.readLine())
    val truthCount = st.nextToken().toInt()
    val truthPeople = IntArray(truthCount)
    
    // 진실을 아는 사람 없다면 => 모든 파티에서 거짓말 가능
    if (truthCount == 0) {
        println(m)
        return
    }
    
    // 진실을 아는 사람 목록
    for (i in 0 until truthCount) {
        truthPeople[i] = st.nextToken().toInt()
    }
    
    // 파티 정보 
    val parties = ArrayList<ArrayList<Int>>()
    for (i in 0 until m) {
        parties.add(ArrayList())
        st = StringTokenizer(br.readLine())
        val count = st.nextToken().toInt()
        
        // 파티 참여자 = 0명인 경우
        if (count > 0) {
            // 첫 번째 사람 기준
            val firstPerson = st.nextToken().toInt()
            parties[i].add(firstPerson)
            
            for (j in 1 until count) {
                val nextPerson = st.nextToken().toInt()
                parties[i].add(nextPerson)
                // 같은 파티에 있는 사람들을 하나의 집합으로 연결
                union(firstPerson, nextPerson)
            }
        }
    }
    
    // 과장된 이야기 할 수 있는 파티 개수
    var answer = 0
    
    for (party in parties) {
        var canLie = true

        // 파티 참여자 중 한 명이라도 진실을 아는 사람 연결 여부 확인
        for (person in party) {
            for (truthPerson in truthPeople) {
                // 파티에 있는 사람 == 진실을 아는 사람
                if (find(person) == find(truthPerson)) {
                    canLie = false
                    break
                }
            }
            if (!canLie) break
        }
        if (canLie) answer++
    }

    println(answer)
}

// Find 연산: 경로 압축 적용
fun find(x: Int): Int {
    if (parent[x] == x) {
        return x
    }
    parent[x] = find(parent[x])
    return parent[x]
}

// Union 연산: 두 원소가 속한 집합 합치기
fun union(a: Int, b: Int) {
    val rootA = find(a)
    val rootB = find(b)
    
    if (rootA != rootB) {
        if (rootA < rootB) {
            parent[rootB] = rootA
        } else {
            parent[rootA] = rootB
        }
    }
}
