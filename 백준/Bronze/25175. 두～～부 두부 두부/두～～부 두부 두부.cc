#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, M, K;
    cin >> N >> M >> K;

    cout << ((M - 1) + (K - 3) % N + N) % N + 1 << '\n';

    return 0;
}