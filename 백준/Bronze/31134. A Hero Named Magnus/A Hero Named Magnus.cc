#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        long long x;
        cin >> x;

        long n = 2 * x - 1;
        cout << n << '\n';
    }

    return 0;
}