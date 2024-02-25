// BOJ: 10988
#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str;
    cin >> str;
    int len = str.length();
    bool is_palin = true;
    for (int i = 0; i < len/2; i++) {
        if (str[i] != str[len-i-1]) {
            is_palin = false;
            break;
        }
    }
    if (is_palin == true) cout << 1 << "\n";
    else cout << 0 << "\n";
    return 0;
}