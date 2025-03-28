#include <iostream>
#include <string>
using namespace std;

inline bool vowel(char c) {
  return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while (true) {
        string str; 
        cin >> str;
        if (str == "#") break;

        for (int i = 0; i < str.length(); i++) {
            if (vowel(str[0])) break;
            str += str[0];
            str.erase(0, 1);
        }

        cout << str << "ay\n";
    }

    return 0;
}