class Solution {
    fun solution(points: Array<IntArray>, routes: Array<IntArray>): Int {
        // 포인트 번호별 좌표 
        val pointMap = HashMap<Int, Pair<Int, Int>>()
        for (i in points.indices) {
            pointMap[i + 1] = Pair(points[i][0], points[i][1])
        }
        
        // 각 로봇 시간에 따른 전체 경로 
        val robotPaths = ArrayList<ArrayList<Pair<Int, Int>>>()
        var maxTime = 0 // 가장 오래 걸리는 로봇 운송 시간
        
        for (route in routes) {
            val path = ArrayList<Pair<Int, Int>>()
            var currR = pointMap[route[0]]!!.first
            var currC = pointMap[route[0]]!!.second
            
            path.add(Pair(currR, currC)) // 0초일 때의 초기 위치 
            
            for (i in 1 until route.size) {
                val targetR = pointMap[route[i]]!!.first
                val targetC = pointMap[route[i]]!!.second
                
                while (currR != targetR) {
                    if (currR < targetR) currR++ else currR--
                    path.add(Pair(currR, currC))
                }
                
                while (currC != targetC) {
                    if (currC < targetC) currC++ else currC--
                    path.add(Pair(currR, currC))
                }
            }
            robotPaths.add(path)
            
            // 전체 로봇 중 가장 긴 이동 시간 업데이트 
            if (path.size > maxTime) {
                maxTime = path.size
            }
        }
        
        var totalRisks = 0 // 시간대별 충돌 위험 
        
        for (t in 0 until maxTime) {
            val positionCounts = HashMap<Pair<Int, Int>, Int>() // 시간 t에 각 좌표에 로봇이 몇 대 있는지 세기 
            
            for (path in robotPaths) {
                if (t < path.size) { // 로봇 아직 운송 마치지 X
                    val pos = path[t]
                    positionCounts[pos] = positionCounts.getOrDefault(pos, 0) + 1
                }
            }
            
            // 해당 시간에 2대 이상의 로봇이 모인 좌표 수 누적 
            for (count in positionCounts.values) {
                if (count >= 2) {
                    totalRisks++
                }
            }
        }
        
        return totalRisks
    }
}