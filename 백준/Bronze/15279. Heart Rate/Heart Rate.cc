#include <iomanip>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; 
    cin >> n;

    while (n--) {
        double b, p;
        cin >> b >> p;

        cout << fixed << setprecision(5) << (60 * b / p) * (1 - 1 / b) << " " << 60 * b / p << " " << (60 * b / p) * (1 + 1 / b) << "\n";
    };

    return 0;
}