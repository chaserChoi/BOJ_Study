#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    vector<int> choco(n);

    for (int i = 0; i < n; i++)
        cin >> choco[i];

    int total = 0;
    int prev = choco[0];

    for (int i = 1; i < n; i++) {
        int cur = choco[i];

        if (cur > prev) {
            int diff = cur - prev;
            total += (diff + 99) / 100;
        }

        prev = cur;
    }

    cout << total << '\n';

    return 0;
}