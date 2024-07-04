#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, X;
    cin >> N >> X;

    int ans = -1;
    while (N--) {
        int S, T;
        cin >> S >> T;

        if (S + T > X) continue;

        ans = max(ans, S);
    }

    cout << ans << '\n';

    return 0;
}