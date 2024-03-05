#include <iostream>
using namespace std;

int main() {
    int L;
    cin >> L;
    int N;
    char x;
    while (L--) {
        cin >> N >> x;
        while (N--) cout << x;
        cout << "\n";
    }
    return 0;
}