#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    while (n--) {
        string pwd;
        cin >> pwd;
        if (pwd.size() >= 6 && pwd.size() <= 9) cout << "yes\n";
        else cout << "no\n";
    }
    return 0;
}