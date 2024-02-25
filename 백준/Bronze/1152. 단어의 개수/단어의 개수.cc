#include <iostream>
#include <string>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str;
    getline(cin, str);
    int cnt = 0;
    if (str[0] != ' ') cnt++;
    for (int i = 1; i < str.length(); i++) {
        if (str[i-1] == ' ' && str[i] != ' ') cnt++;
    }
    cout << cnt << "\n";
    return 0;
}