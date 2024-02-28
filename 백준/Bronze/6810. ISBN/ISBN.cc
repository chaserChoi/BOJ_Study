#include <iostream>
using namespace std;

int main() {
    int isbn[13] = { 9, 7, 8, 0, 9, 2, 1, 4, 1, 8, 0, 0, 0 };
    cin >> isbn[10] >> isbn[11] >> isbn[12];
    int one_three_sum = 0;
    for (int i = 0; i < 13; i++) {
        if (i % 2 == 0) isbn[i] *= 1;
        else isbn[i] *= 3;
        one_three_sum += isbn[i];
    }
    cout << "The 1-3-sum is " << one_three_sum << "\n";
    return 0;
}