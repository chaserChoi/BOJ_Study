// BOJ: 5622
#include <iostream>
#include <string>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str;
    int sec = 0;
    cin >> str;
    for (int i = 0; i < str.length(); i++) {
        if ('A' <= str[i] && 'C' >= str[i]) sec += 3;
        else if ('D' <= str[i] && 'F' >= str[i])
            sec += 4;
        else if ('G' <= str[i] && 'I' >= str[i])
            sec += 5;
        else if ('J' <= str[i] && 'L' >= str[i])
            sec += 6;
        else if ('M' <= str[i] && 'O' >= str[i])
            sec += 7;
        else if ('P' <= str[i] && 'S' >= str[i])
            sec += 8;
        else if ('T' <= str[i] && 'V' >= str[i])
            sec += 9;
        else
            sec += 10;
    }
    cout << sec << "\n";
    return 0;
}