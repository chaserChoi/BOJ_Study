#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;

    int maxLen = 0;
    vector<int> maxSeq;

    for (int i = 1; i <= 30000; i++) {
        vector<int> seq;
        seq.push_back(n);
        seq.push_back(i);

        int a = n, b = i;
        while (b >= 0) {
            int c = a - b;
            if (c < 0) break;
            seq.push_back(c);
            a = b;
            b = c;
        }

        if (seq.size() > maxLen) {
            maxLen = seq.size();
            maxSeq = seq;
        }
    }

    cout << maxLen << '\n';
    for (int num : maxSeq) cout << num << ' ';
    cout << '\n';
    
    return 0;
}