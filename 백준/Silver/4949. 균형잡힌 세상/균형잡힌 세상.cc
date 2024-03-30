#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str;
    cin.ignore();
    while (true) {
        getline(cin, str);
        if (str == ".") break;
        stack<char> s;
        bool flag = true;
        for (char c : str) {
            if (c == '(' || c == '[') s.push(c);
            else if (c == ')') {
                if (s.empty() || s.top() != '(') {
                    flag = false;
                    break;
                }
                s.pop();
            } else if (c == ']') {
                if (s.empty() || s.top() != '[') {
                    flag = false;
                    break;
                }
                s.pop();
            }
        }
        if (flag && s.empty()) cout << "yes\n";
        else cout << "no\n";
    }
    return 0;
}