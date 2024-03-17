#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool comp(pair<int, string> a, pair<int, string> b) {
    return a.first < b.first;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    pair<int, string> tmp;
    vector<pair<int, string>> arr;
    while (n--) {
        cin >> tmp.first >> tmp.second;
        arr.push_back(tmp);
    }
    stable_sort(arr.begin(), arr.end(), comp);
    for (auto i : arr) cout << i.first << " " << i.second << "\n";
    return 0;
}