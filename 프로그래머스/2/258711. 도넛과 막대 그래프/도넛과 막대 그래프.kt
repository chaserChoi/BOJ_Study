class Solution {
    fun solution(edges: Array<IntArray>): IntArray {
        var maxNode = 0 // 가장 큰 정점 번호 
        for (edge in edges) {
            if (edge[0] > maxNode) maxNode = edge[0]
            if (edge[1] > maxNode) maxNode = edge[1]
        }
        
        val inDegree = IntArray(maxNode + 1) // 정점 진입 차수 
        val outDegree = IntArray(maxNode + 1) // 정점 진출 차수 
        
        for (edge in edges) {
            val from = edge[0]
            val to = edge[1]
            outDegree[from]++
            inDegree[to]++
        }
        
        var createdNode = 0 // 생성한 정점
        var donutCount = 0 // 도낫 그래프 
        var barCount = 0 // 막대 그래프 끝점 
        var figure8Count = 0 // 8자 그래프 중심점 
        
        for (i in 1..maxNode) {
            if (inDegree[i] == 0 && outDegree[i] >= 2) { // 들어오는 간선 X & 나가는 간선 >= 2
                createdNode = i 
            } else if (outDegree[i] == 0 && inDegree[i] > 0) { // 나가는 간선 X 
                barCount++
            } else if (inDegree[i] >= 2 && outDegree[i] >= 2) { // 들어오는 간선 >= 2 & 나가는 간선 >= 2
                figure8Count++
            }
        }
        
        val totalGraphs = outDegree[createdNode]
        donutCount = totalGraphs - barCount - figure8Count
        
        return intArrayOf(createdNode, donutCount, barCount, figure8Count)
    }
}