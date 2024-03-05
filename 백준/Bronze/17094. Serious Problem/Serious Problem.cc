#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;
    int e_cnt = 0, two_cnt = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '2') two_cnt++;
        else e_cnt++;
    }
    if (e_cnt > two_cnt) cout << 'e' << "\n";
    else if (e_cnt < two_cnt) cout << '2' << "\n";
    else cout << "yee" << "\n";
    return 0;
}