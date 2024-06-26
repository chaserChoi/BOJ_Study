#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    vector<pair<int, int>> v(N);

    for (int i = 0; i < N; i++)
        cin >> v[i].first >> v[i].second;

    int total = 0;
    for (int i = 1; i < N; i++)
        total += abs(v[i].first - v[i - 1].first) + abs(v[i].second - v[i - 1].second);

    cout << total << '\n';

    return 0;
}