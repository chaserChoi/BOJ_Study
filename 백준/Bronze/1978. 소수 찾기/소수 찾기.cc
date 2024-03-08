#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int cnt = 0;
    while (n--) {
        int num;
        cin >> num;
        int isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true && num != 1) cnt++;
    }
    cout << cnt << "\n";
    return 0;
}