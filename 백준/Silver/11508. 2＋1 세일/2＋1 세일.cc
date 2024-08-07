#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;

    vector<int> v(n);
    for (int i = 0; i < n; i++) cin >> v[i];
    
    sort(v.begin(), v.end(), greater<int>());

    int ans = 0;
    for (int i = 0; i < n; i++) 
        if (i % 3 != 2) ans += v[i];
    
    cout << ans << '\n';

    return 0;
}