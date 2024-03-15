#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    vector<string> v;
    while (n--) {
        string s;
        cin >> s;
        v.push_back(s);
    }
    sort(v.begin(), v.end(), [](string a, string b) {
        if (a.size() == b.size()) {
            return a < b;
        }
        return a.size() < b.size();
    });
    v.erase(unique(v.begin(), v.end()), v.end());
    for (string s : v) cout << s << '\n';
    return 0;
}