#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string a, b;
    cin >> a >> b;
    if (a.length() >= b.length()) cout << "go\n";
    else cout << "no\n";
    return 0;
}