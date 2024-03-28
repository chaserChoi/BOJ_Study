#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        stack<char> st;
        bool flag = true;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '(') st.push(s[i]);
            else {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                st.pop();
            }
        }
        if (flag && st.empty()) cout << "YES\n";
        else cout << "NO\n";
    }
    return 0;
}