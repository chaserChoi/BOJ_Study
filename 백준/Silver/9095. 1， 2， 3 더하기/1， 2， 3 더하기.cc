#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int T, n;
    cin >> T;

    int dp[12] = { 0, 1, 2, 4 };

    for (int i = 4; i <= 11; i++)
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

    while (T--) {
        cin >> n;
        cout << dp[n] << '\n';
    }

    return 0;
}