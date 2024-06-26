#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, M, i, j;
    cin >> N >> M;
    vector<int> nums(N + 1, 0);
    for (int i = 1; i <= N; i++)
        cin >> nums[i];

    vector<int> sum(N + 1, 0);
    for (int i = 1; i <= N; i++)
        sum[i] = sum[i - 1] + nums[i];

    while (M--) {
        cin >> i >> j;
        cout << sum[j] - sum[i - 1] << '\n';
    }

    return 0;
}