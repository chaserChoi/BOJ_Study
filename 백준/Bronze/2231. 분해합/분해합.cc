#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    int N;
    cin >> N;
    for (int i = 1; i < N; i++) {
        int temp = i;
        int sum = i;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == N) {
            cout << i << "\n";
            return 0;
        }
    }
    cout << 0 << "\n";
    return 0;
}