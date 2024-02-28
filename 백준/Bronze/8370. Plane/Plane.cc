#include <iostream>
using namespace std;

int main() {
    int n1, k1, n2, k2;
    cin >> n1 >> k1 >> n2 >> k2;
    int avail_seats = n1 * k1 + n2 * k2;
    cout << avail_seats << "\n";
    return 0;
}