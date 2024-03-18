#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, m;
    int k;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        cin >> k;
        a.push_back(k);
    }
    sort(a.begin(), a.end());
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> k;
        cout << (int)binary_search(a.begin(), a.end(), k) << "\n";
    }
    return 0;
}