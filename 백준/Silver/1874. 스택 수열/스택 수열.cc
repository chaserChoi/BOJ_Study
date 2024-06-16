#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    vector<int> seq(n);
    stack<int> st;
    vector<char> ans;
    for (int i = 0; i < n; i++) cin >> seq[i];

    int curr = 1;
    for (int i = 0; i < n; i++) {
        while (curr <= seq[i]) {
            st.push(curr++);
            ans.push_back('+');
        }

        if (st.top() == seq[i]) {
            st.pop();
            ans.push_back('-');
        } else {
            cout << "NO" << '\n';
            return 0;
        }
    }

    for (char c : ans) cout << c << '\n';

    return 0;
}