#include <iostream>
#include <queue>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, k;
    cin >> n >> k;
    queue<int> q;
    for (int i = 1; i <= n; i++) q.push(i);
    cout << "<";
    while (1) {
        if (q.empty()) break;
        for (int i = 1; i <= k; i++) {
            if (i != k) {
                int t = q.front();
                q.pop();
                q.push(t);
            } else {
                cout << q.front();
                q.pop();
                if (!q.empty()) cout << ", ";
            }
        }
    }
    cout << ">";
    return 0;
}