#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int coin;
    cin >> coin;

    for (int i = 1; i <= coin; i++) {
        if (i % 3 == 0 && i % 5 == 0) cout << "DeadMan" << '\n';
        else if (i % 3 == 0) cout << "Dead" << '\n';
        else if (i % 5 == 0) cout << "Man" << '\n';
        else cout << i << " ";
    }

    return 0;
}
