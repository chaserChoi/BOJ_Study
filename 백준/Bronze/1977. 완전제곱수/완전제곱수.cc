#include <iostream>
using namespace std;

int main() {
    int M, N;
    cin >> M >> N;
    int min = 0, sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i * i >= M && i * i <= N) {
            if (min == 0) min = i * i;
            sum += i * i;
        }
    }
    if (sum == 0) cout << -1 << "\n";
    else cout << sum << "\n" << min << "\n";
    return 0;
}