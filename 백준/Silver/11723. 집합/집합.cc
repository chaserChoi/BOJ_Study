// BOJ 11723 집합
#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int M, x;
    string cmd;
    unsigned int S = 0;
    cin >> M;

    while (M--) {
        cin >> cmd;
        if (cmd == "add") {
            cin >> x;
            S |= (1 << (x - 1));
        } else if (cmd == "remove") {
            cin >> x;
            S &= ~(1 << (x - 1));
        } else if (cmd == "check") {
            cin >> x;
            cout << ((S & (1 << (x - 1))) ? 1 : 0) << '\n';
        } else if (cmd == "toggle") {
            cin >> x;
            S ^= (1 << (x - 1));
        } else if (cmd == "all") S = (1 << 20) - 1;
        else S = 0;
    }

    return 0;
}