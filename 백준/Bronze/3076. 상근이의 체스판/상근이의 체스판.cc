#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int R, C, A, B;
    cin >> R >> C;
    cin >> A >> B;

    for (int i = 0; i < R * A; i++) {
        for (int j = 0; j < C * B; j++) {
            if ((i / A) % 2 == 0) {
                if ((j / B) % 2 == 0) cout << "X";
                else cout << ".";
            } else {
                if ((j / B) % 2 == 0) cout << ".";
                else cout << "X";
            }
        }
        cout << "\n";
    }

    return 0;
}