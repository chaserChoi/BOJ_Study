#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int T, N;
    cin >> T;
    vector<long long> P(101, 0);
    P[1] = P[2] = P[3] = 1;

    for (int i = 4; i <= 100; i++)
        P[i] = P[i - 2] + P[i - 3];

    while (T--) {
        cin >> N;
        cout << P[N] << '\n';
    }

    return 0;
}