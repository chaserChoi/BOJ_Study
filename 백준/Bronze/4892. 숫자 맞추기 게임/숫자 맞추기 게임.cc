#include <iostream>
using namespace std;

int main() {
    int num;
    int case_num = 1;
    while (true) {
        cin >> num;
        num *= 3;
        if (num == 0) break;
        if (num % 2 == 0) {
            num /= 2;
            num *= 3;
            num /= 9;
            cout << case_num << ". even " << num << "\n";
        } else {
            num = (num+1)/2;
            num *= 3;
            num /= 9;
            cout << case_num << ". odd " << num << "\n";
        }
        case_num++;
    }
    return 0;
}