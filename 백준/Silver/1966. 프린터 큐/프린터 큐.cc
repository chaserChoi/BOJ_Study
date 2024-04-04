#include <iostream>
#include <queue>
#include <utility>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    while (T--) {
        int N, M, importance;
        queue<pair<int, int>> q;
        priority_queue<int> pq;
        cin >> N >> M;
        for (int i = 0; i < N; i++) {
            cin >> importance;
            q.push({i, importance});
            pq.push(importance);
        }
        int cnt = 0;
        while (!q.empty()) {
            int idx = q.front().first;
            int val = q.front().second;
            q.pop();
            if (pq.top() == val) {
                pq.pop();
                cnt++;
                if (idx == M) {
                    cout << cnt << "\n";
                    break;
                }
            } else q.push({idx, val});
        }
    }
    return 0;
}