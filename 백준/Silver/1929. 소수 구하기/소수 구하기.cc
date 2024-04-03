#include <iostream>
#include <vector>
using namespace std;

void Eratos(int M, int N) {
    vector<bool> prime(N+1, true);
    prime[0] = prime[1] = false;

    for (int i = 2; i*i <= N; i++) {
        if (prime[i]) {
            for (int j = i * i; j <= N; j += i) prime[j] = false;
        }
    }

    for (int i = M; i <= N; i++) {
        if (prime[i]) cout << i << "\n";
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int M, N;
    cin >> M >> N;
    Eratos(M, N);
    return 0;
}