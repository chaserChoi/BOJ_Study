#include <iostream>
using namespace std;

int main() {
    int a[3], b[3];
    int a_sum = 0, b_sum = 0;
    for (int i = 0; i < 3; i++) {
        cin >> a[i];
        a_sum += a[i]*(3-i);
    }
    for (int j = 0; j < 3; j++) {
        cin >> b[j];
        b_sum += b[j]*(3-j);
    }
    if (a_sum > b_sum) cout << "A";
    else if (a_sum < b_sum) cout << "B";
    else cout << "T";
    return 0;
}