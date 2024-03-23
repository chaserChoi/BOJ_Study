#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    cin >> s;
    char temp = s[0];
    s[0] = s[2];
    s[2] = temp;
    cout << s << "\n";
    return 0;
}