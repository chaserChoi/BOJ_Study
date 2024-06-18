#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    vector<int> p(N);
    for (int i = 0; i < N; i++) cin >> p[i];

    sort(p.begin(), p.end());

    int sum = 0;
    int total = 0;
    for (int i = 0; i < N; i++) {
        sum += p[i];
        total += sum;
    }

    cout << total << '\n';

    return 0;
}