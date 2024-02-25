// BOJ:  3003
#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int chess[6];
    int result[6] = { 1, 1, 2, 2, 2, 8 };
    for (int i = 0; i < 6; i++) {
        cin >> chess[i];
        result[i] -= chess[i];
    }
    for (int i = 0; i < 6; i++) cout << result[i] << " ";
    return 0;
}