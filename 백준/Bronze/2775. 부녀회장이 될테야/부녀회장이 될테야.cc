#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    int arr[15][15] = { 0, };
    for (int i = 0; i < 15; i++) {
        arr[0][i] = i;
    }
    while (T--) {
        int k, n;
        cin >> k >> n;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j]) continue;
                for (int l = 1; l <= j; l++) arr[i][j] += arr[i-1][l];
            }
        }
        cout << arr[k][n] << "\n";
    }
    return 0;
}