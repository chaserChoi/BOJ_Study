#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int X;
    cin >> X;
    if (X % 7 == 2) cout << 1 << "\n";
    else cout << 0 << "\n";
    return 0;
}