#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, M;
    cin >> N >> M;

    vector<int> freq(N + M + 1, 0);

    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= M; j++)
            freq[i + j]++;
    }

    int max = *max_element(freq.begin(), freq.end());

    for (int i = 2; i <= N + M; i++) {
        if (freq[i] == max)
            cout << i << '\n';
    }

    return 0;
}