#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int K, N;
    cin >> K >> N;

    vector<long long> cables(K);
    long long maxLen = 0;

    for (int i = 0; i < K; i++) {
        cin >> cables[i];
        maxLen = max(maxLen, cables[i]);
    }

    long long left = 1, right = maxLen;
    long long ans = 0;

    while (left <= right) {
        long long mid = (left + right) / 2;
        long long cnt = 0;

        for (long long cable : cables) cnt += cable / mid;

        if (cnt >= N) {
            ans = mid;
            left = mid + 1;
        } else right = mid - 1;
    }

    cout << ans << '\n';

    return 0;
}