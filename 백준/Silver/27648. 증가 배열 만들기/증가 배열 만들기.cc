#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, M, K;
    cin >> N >> M >> K;
    int arr[N][M] = { 0, };

    arr[0][0] = 1;
    arr[N-1][M-1] = K;

    if (N + M - 1 <= K) {
        cout << "YES" << '\n';
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= M; j++)
                cout << i + j << ' ';
            cout << '\n';
        }
    } else cout << "NO" << '\n';

    return 0;
}