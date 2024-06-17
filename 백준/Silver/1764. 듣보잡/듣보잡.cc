// BOJ 1764 듣보잡
#include <iostream>
#include <unordered_set>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, M;
    cin >> N >> M;

    unordered_set<string> heard;
    unordered_set<string> seen;

    for (int i = 0; i < N; i++) {
        string name;
        cin >> name;
        heard.insert(name);
    }

    for (int i = 0; i < M; i++) {
        string name;
        cin >> name;
        seen.insert(name);
    }

    vector<string> ans;
    for (const string& name : heard) 
        if (seen.count(name)) ans.push_back(name);

    sort(ans.begin(), ans.end());

    cout << ans.size() << '\n';
    for (const string& name : ans) cout << name << '\n';

    return 0;
}