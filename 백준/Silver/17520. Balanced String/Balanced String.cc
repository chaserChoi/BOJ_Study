#include <iostream>
using namespace std;

const int MOD = 16769023;

int main() {
    int n;
    cin >> n;

    long long ans = 1;
    for (int i = 0; i < (n + 1) / 2; i++) {
        ans = (ans * 2) % MOD;
    }

    cout << ans << '\n';

    return 0;
}