#include <iostream>
using namespace std;

int main() {
    int win_cnt = 0;
    for (int i = 1; i <= 6; i++) {
        char result;
        cin >> result;
        if (result == 'W') win_cnt++;
    }
    switch (win_cnt) {
        case 6:
        case 5:
            cout << 1 << "\n";
            break;
        case 4:
        case 3:
            cout << 2 << "\n";
            break;
        case 2:
        case 1:
            cout << 3 << "\n";
            break;
        default:
            cout << -1 << "\n";
            break;
    }
    return 0;
}