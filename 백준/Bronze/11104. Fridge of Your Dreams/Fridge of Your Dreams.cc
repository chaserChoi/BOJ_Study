#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n--) {
        string binary;
        cin >> binary;
        int decimal = stoi(binary, nullptr, 2);
        cout << decimal << "\n";
    }
    return 0;
}