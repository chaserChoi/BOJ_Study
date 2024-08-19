#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    vector<int> cards(n);
    for (int i = 0; i < n; i++) cin >> cards[i];

    int score = 0;
    bool inGroup = false;

    for (int i = 0; i < n; i++) {
        if (i == 0 || cards[i] - cards[i - 1] != 1) {
            score += cards[i];
            inGroup = false;
        } else
            inGroup = true;
    }

    cout << score << '\n';

    return 0;
}