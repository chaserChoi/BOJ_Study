#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (true) {
        cin >> a >> b;
        if (a > b) cout << "Yes" << "\n";
        else if (a <= b && a != 0 && b != 0) cout << "No" << "\n";
        else if (a == 0 && b == 0) break;
    }
    return 0;
}