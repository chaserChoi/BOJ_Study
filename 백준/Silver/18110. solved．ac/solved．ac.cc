#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    if (n == 0) {
        cout << 0;
        return 0;
    }
    vector<int> opinions(n);
    for (int i = 0; i < n; i++) cin >> opinions[i];
    sort(opinions.begin(), opinions.end());
    int trim = round(n * 0.15);
    int sum = 0;
    for (int i = trim; i < n - trim; i++) sum += opinions[i];
    int avg = round((double)sum / (n - 2 * trim));
    cout << avg;
    return 0;
}