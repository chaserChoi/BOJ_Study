#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    string s;
    cin >> s;

    int cnt = 1;
    bool flag = false;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'L')
            i++;
        cnt++;
    }

    cout << min(cnt, n) << '\n';

    return 0;
}