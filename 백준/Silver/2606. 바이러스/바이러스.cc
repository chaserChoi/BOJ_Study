// BOJ 2606 바이러스
#include <iostream>
#include <vector>
using namespace std;

bool visited[101];
vector<int> gr[101];

void dfs(int s) {
    visited[s] = true;
    for (int i = 0; i < gr[s].size(); i++) {
        int next = gr[s][i];
        if (!visited[next])
            dfs(next);
    }
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;

    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        gr[a].push_back(b);
        gr[b].push_back(a);
    }

    dfs(1);

    int cnt = 0;
    for (int i = 2; i <= n; i++) if (visited[i]) cnt++;

    cout << cnt << '\n';

    return 0;
}