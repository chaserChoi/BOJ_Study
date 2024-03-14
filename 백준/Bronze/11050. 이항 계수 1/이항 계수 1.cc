#include <iostream>
using namespace std;

int factorial(int n) {
    int num = 1;
    for (int i = n; i > 0; i--) num *= i;
    return num;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, k;
    cin >> n >> k;
    cout << factorial(n) / (factorial(k) * factorial(n-k)) << "\n";
    return 0;
}