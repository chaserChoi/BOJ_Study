#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n--) {
        int num;
        cin >> num;
        cout << "Pairs for " << num << ": ";
        for (int i = 1; i <= num / 2; i++) {
            if (i != num-i) cout << i << " " << num - i;
            if (i+1 < num-i-1) cout << ", ";
        }
        cout << '\n';
    }
    return 0;
}