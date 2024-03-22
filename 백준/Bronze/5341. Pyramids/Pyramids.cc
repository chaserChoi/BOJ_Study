#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    while (true) {
        cin >> n;
        if (n == 0) break;
        int total = n * (n + 1) / 2;
        cout << total << "\n";
    }
    return 0;
}