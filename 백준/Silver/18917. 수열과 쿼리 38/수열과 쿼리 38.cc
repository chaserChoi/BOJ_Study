#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int M;
    cin >> M;
    long long sum = 0, xorSum = 0;
    for (int i = 0; i < M; i++) {
        int q, x;
        cin >> q;
        switch (q) {
            case 1:
                cin >> x;
                sum += x;
                xorSum ^= x;
                break;
            case 2:
                cin >> x;
                sum -= x;
                xorSum ^= x;
                break;
            case 3:
                cout << sum << "\n";
                break;
            case 4:
                cout << xorSum << "\n";
                break;
        }
    }
    return 0;
}