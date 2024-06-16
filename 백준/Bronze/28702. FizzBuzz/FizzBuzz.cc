#include <iostream>
#include <string>
using namespace std;

string calc(int n) {
    if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
    if (n % 3 == 0) return "Fizz";
    if (n % 5 == 0) return "Buzz";
    return to_string(n);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    string a, b, c;
    cin >> a >> b >> c;

    if (a[0] >= '0' && a[0] <= '9')
        cout << calc(stoi(a) + 3);
    else if (b[0] >= '0' && b[0] <= '9')
        cout << calc(stoi(b) + 2);
    else if (c[0] >= '0' && c[0] <= '9') 
        cout << calc(stoi(c) + 1);

    return 0;
}