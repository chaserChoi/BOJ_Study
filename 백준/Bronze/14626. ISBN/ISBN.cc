#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    string isbn;
    cin >> isbn;

    int sum = 0;
    int idx = 0;
    for (int i = 0; i < isbn.size(); i++) {
        if (isbn[i] == '*') idx = i;
        else sum += (isbn[i] - '0') * (i & 1 ? 3 : 1);
    }

    for (int i = 0; i <= 9; i++) {
        if ((sum + i * (idx & 1 ? 3 : 1)) % 10) continue;
        cout << i;
        break;
    }
    
    return 0;
}