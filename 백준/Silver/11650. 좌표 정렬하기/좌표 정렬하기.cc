#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    pair<int, int> p;
    vector<pair<int, int>> v;
    while (n--) {
        cin >> p.first >> p.second;
        v.push_back(p);
    }
    sort(v.begin(), v.end());
    for (auto i : v) cout << i.first << " " << i.second << "\n";
    return 0;
}