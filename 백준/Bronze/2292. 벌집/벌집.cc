#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    long long N;
    cin >> N;
    long long cnt = 1;
    long long range = 1;
    while (range < N) {
        range += 6 * cnt;
        cnt++;
    }
    cout << cnt;
    return 0;
}