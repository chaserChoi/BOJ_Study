#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, M, K;
    cin >> N >> M >> K;
    vector<int> pens(N);
    for (int i = 0; i < N; i++) cin >> pens[i];

    sort(pens.begin(), pens.end(), greater<int>());

    int cnt = 0, total = 0;
    for (int i = 0; i < N; i++) {
        total += pens[i];
        if (total >= M * K) {
            cout << i + 1 << '\n';
            return 0;
        }
        cnt++;
    }

    cout << "STRESS" << '\n';

    return 0;
}