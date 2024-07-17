#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    string s;
    getline(cin, s);

    int flag = 0;

    for (int i = 0; i < s.size(); i++) {
        if (s[i] == 'U' && flag == 0) flag++;
        else if (s[i] == 'C' && flag == 1) flag++;
        else if (s[i] == 'P' && flag == 2) flag++;
        else if (s[i] == 'C' && flag == 3) {
            flag++;
            break;
        }
    }

    if (flag == 4) cout << "I love UCPC" << '\n';
    else cout << "I hate UCPC" << '\n';
    
    return 0;
}