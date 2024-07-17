#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;

    for (int i = 1; i <= t; i++) {
        int g;
        cin >> g;

        unordered_set<int> guests;

        for (int i = 0; i < g; i++) {
            int code;
            cin >> code;

            if (guests.find(code) == guests.end())
                guests.insert(code);
            else
                guests.erase(code);
        }

        cout << "Case #" << i << ": " << *guests.begin() << '\n';
    }
    
    return 0;
}