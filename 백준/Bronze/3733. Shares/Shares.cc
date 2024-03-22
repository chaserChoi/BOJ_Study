#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N, S;
    while (cin >> N >> S) cout << S/(N+1) << '\n';
    return 0;
}