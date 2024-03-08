#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    while(true) {
        cin >> a >> b >> c;
        if (a == 0 && b == 0 && c == 0) break;
        int temp = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a*a + b*b == c*c) cout << "right" << "\n";
        else cout << "wrong" << "\n";
    }
    return 0;
}