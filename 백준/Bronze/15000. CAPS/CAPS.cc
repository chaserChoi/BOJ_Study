#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    for (int i = 0; i < str.length(); i++) {
        cout << (char)toupper(str[i]);
    }
    return 0;
}