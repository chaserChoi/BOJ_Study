#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    int cnt = 0;
    int num = 666;
    while (1) {
        string s = to_string(num);
        if (s.find("666") != string::npos) {
            cnt++;
        }
        if (cnt == n) {
            cout << num << '\n';
            break;
        }
        num++;
    }
    return 0;
}