#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, num;
    cin >> n;
    vector<int> children(n);
    for (int i = 1; i <= n; i++) {
        cin >> num;
        children.insert(children.begin() + num, i);
    }
    for (int i = n-1; i >= 0; i--) cout << children[i] << " ";
    return 0;
}