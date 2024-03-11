#include <iostream>
#include<string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0); 
    while (true) {
        string str;
        cin >> str;
        if (str == "0") break;
        bool isPal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str[i] != str[str.length() - 1 - i]) isPal = false;
        }
        if (isPal == true) cout << "yes\n";
        else cout << "no\n";
    }
    return 0;
}