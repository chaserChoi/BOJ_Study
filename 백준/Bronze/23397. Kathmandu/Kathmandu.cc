#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t, d, m; 
    cin >> t >> d >> m;

    if (m == 0) {
        cout << (d >= t ? 'Y' : 'N');
        return 0;
    }

    vector<int> y(m);
    for (int i = 0; i < m; i++) {
        cin >> y[i];
    }

    if (y[0] >= t) {
        cout << 'Y';
        return 0;
    }

    for (int i = 1; i < m; i++) {
        if (y[i] - y[i - 1] >= t) {
            cout << 'Y';
            return 0;
        }
    }

    if (d - y[m - 1] >= t) {
        cout << 'Y';
        return 0;
    }

    cout << 'N';
    
    return 0;
}
