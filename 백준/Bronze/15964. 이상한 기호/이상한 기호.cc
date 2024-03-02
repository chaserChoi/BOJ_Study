#include <iostream>
using namespace std;

int new_arithmetic(int a, int b) {
    return (a + b) * (a - b);
}

int main() {
    int a, b;
    cin >> a >> b;
    cout << new_arithmetic(a, b) << "\n";
    return 0;
}