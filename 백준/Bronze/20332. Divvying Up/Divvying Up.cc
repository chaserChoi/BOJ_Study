#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    int sum = 0;
    for (int i = 0; i < n; i++) {
        int w;
        cin >> w;
        sum += w;
    }

    cout << (sum % 3 == 0 ? "yes" : "no");

    return 0;
}