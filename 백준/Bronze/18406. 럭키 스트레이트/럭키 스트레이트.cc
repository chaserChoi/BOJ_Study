#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    int left_sum = 0, right_sum = 0;
    int tmp = n;

    for (int i = 0; i < (int)to_string(n).length() / 2; i++) {
        left_sum += tmp % 10;
        tmp /= 10;
    }

    for (int i = 0; i < (int)to_string(n).length() / 2; i++) {
        right_sum += tmp % 10;
        tmp /= 10;
    }

    if (left_sum == right_sum) cout << "LUCKY" << '\n';
    else cout << "READY" << '\n';

    return 0;
}