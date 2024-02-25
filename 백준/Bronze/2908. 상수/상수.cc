// BOJ: 1157
#include <iostream>
#include <string>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str1, str2;
    string str1_rev = "", str2_rev = "";
    cin >> str1 >> str2;
    for (int i = 0; i < 3; i++) {
        str1_rev[i] = str1[2-i];
        str2_rev[i] = str2[2-i];
    }
    if (stoi(str1_rev) > stoi(str2_rev)) cout << stoi(str1_rev) << "\n";
    else
        cout << stoi(str2_rev) << "\n";
    return 0;
}