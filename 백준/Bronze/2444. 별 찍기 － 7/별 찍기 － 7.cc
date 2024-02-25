// BOJ: 2444
#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    // 상단 & 중간
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-i-1; j++) cout << " ";
        for (int j = 0; j < 2*i+1; j++) cout << "*";
        cout << "\n";
    }
    // 하단
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) cout << " ";
        for (int j = 0; j < 2*(n-i)-1; j++) cout << "*";
        cout << "\n";
    }
    return 0;
}