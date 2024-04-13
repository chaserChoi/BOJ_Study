#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#include <map>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int N;
    cin >> N;

    vector<int> values(N);
    map<int, int> freqMap;
    int sum = 0;

    for (int i = 0; i < N; ++i) {
        cin >> values[i];
        sum += values[i];
        freqMap[values[i]]++;
    }
    // 산술평균
    double mean = round((double)sum / N);
    cout << (int)mean << '\n';
    sort(values.begin(), values.end());
    // 중앙값
    cout << values[N / 2] << '\n';
    // 최빈값
    vector<pair<int, int>> freqs(freqMap.begin(), freqMap.end());
    sort(freqs.begin(), freqs.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        return a.second > b.second || (a.second == b.second && a.first < b.first);
    });
    int mode;
    if (freqs.size() > 1 && freqs[0].second == freqs[1].second) mode = freqs[1].first; 
    else mode = freqs[0].first; 
    cout << mode << '\n';
    // 범위
    cout << values[N - 1] - values[0] << '\n';

    return 0;
}
