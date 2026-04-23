class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        // 컴퓨터 방문 체크
        boolean[] visited = new boolean[n];
        
        // 0 ~ n - 1번 컴퓨터 순회
        for (int i = 0; i < n; i++) {
            // 아직 방문하지 않은 컴퓨터 만났다면
            if (!visited[i]) {
                dfs(i, computers, visited); // 이 컴퓨터와 연결된 모든 컴퓨터 방문 처리 
                answer++; // 독립된 네트워크 덩어리 1개 추가 
            }
        }
        
        return answer;
    }
    
    // dfs 수행 
    private void dfs(int node, int[][] computers, boolean[] visited) {
        // 현재 노드 방문 처리
        visited[node] = true;
        
        // 현재 컴퓨터(node)와 다른 모든 컴퓨터 연결 상태 확인
        for (int i = 0; i < computers.length; i++) {
            // 자기 자신 X & 두 컴퓨터 서로 연결됨 & 삼대 컴퓨터를 방문 X
            if (i != node && computers[node][i] == 1 && !visited[i]) {
                dfs(i, computers, visited); // 연결된 컴퓨터로 깊이 파고들어 탐색 (재귀)
            }
        }
    }
}