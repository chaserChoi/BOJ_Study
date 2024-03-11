#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0); 
    int L;
    string str;
    cin >> L >> str;
    long long r = 1, M = 1234567891, ans = 0;
    for (int i = 0; i < L; i++) {
        ans = (ans + (str[i] - 'a' + 1) * r) % M;
        r = (r * 31) % M;
    }
    cout << ans;
    return 0;
}