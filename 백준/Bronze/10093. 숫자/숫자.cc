#include <iostream>
using namespace std;

int main() {
    long long A, B;
    cin >> A >> B;
    if (A == B) {
        cout << 0;
        return 0;
    }
    if (A > B) {
        long long temp = A;
        A = B;
        B = temp;
    }
    cout << B - A - 1 << "\n";
    for (long long i = A + 1; i < B; i++) cout << i << " ";
    return 0;
}