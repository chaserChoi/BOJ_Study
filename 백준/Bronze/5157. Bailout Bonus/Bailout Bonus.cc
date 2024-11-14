#include <iostream>
#include <vector>
#include <unordered_set>
#include <iomanip>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int k;
    cin >> k;
    for (int i = 1; i <= k; i++) {
        int c, b, n, r;
        cin >> c >> b >> n >> r;

        unordered_set<int> bailedOut;
        for (int j = 0; j < b; j++) {
            int compIdx;
            cin >> compIdx;
            bailedOut.insert(compIdx);
        }

        long long total = 0;

        for (int j = 0; j < n; j++) {
            int compId, bonus;
            cin >> compId >> bonus;

            if (bailedOut.find(compId) != bailedOut.end())
                total += (bonus * r) / 100;
        }

        cout << "Data Set " << i << ":\n";
        cout << total << "\n\n";
    }
    
    return 0;
}