#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;
    
    vector<int> x(n), l(n);
    vector<char> c(n);

    for (int i = 0; i < n; i++) cin >> x[i];
    for (int i = 0; i < n; i++) cin >> l[i];
    for (int i = 0; i < n; i++) cin >> c[i];

    bool flag = false;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (abs(x[i] - x[j]) <= l[i] + l[j] && c[i] != c[j]) {
                cout << "YES" << '\n';
                cout << i + 1 << ' ' << j + 1 << '\n';
                flag = true;
                break;
            }
        }
        if (flag) break;
    }

    if (!flag) cout << "NO" << '\n';

    return 0;
}