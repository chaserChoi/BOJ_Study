#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, k;
    cin >> n >> k;

    vector<int> coins(n);
    for (int i = 0; i < n; i++) cin >> coins[i];

    reverse(coins.begin(), coins.end());

    int cnt = 0;
    for (int coin : coins) {
        if (coin <= k) {
            cnt += k / coin;
            k -= (k / coin) * coin;
        }
    }

    cout << cnt << '\n';

    return 0;
}