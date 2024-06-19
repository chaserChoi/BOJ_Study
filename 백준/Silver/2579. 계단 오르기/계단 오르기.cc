#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    int stairs[301] = {0, };
    int dp[301] = {0, };

    for (int i = 1; i <= n; i++) cin >> stairs[i];

    dp[1] = stairs[1];
    dp[2] = stairs[1] + stairs[2];
    dp[3] = max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

    for (int i = 4; i <= n; i++) 
        dp[i] = max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);

    cout << dp[n] << '\n';

    return 0;
}