#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int P;
    cin >> P;

    cout << (100 - P) / 25 << ' ' << (100 - P) % 25 / 10 << ' ' << (100 - P) % 25 % 10 / 5 << ' ' << (100 - P) % 25 % 10 % 5;

    return 0;
}