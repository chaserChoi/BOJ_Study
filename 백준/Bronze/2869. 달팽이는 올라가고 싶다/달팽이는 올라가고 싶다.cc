#include <iostream>
using namespace std;

int main() {
    long long a, b, v;
    cin >> a >> b >> v;
    long long day = 1;
    day += (v-a) / (a-b);
    if ((v-a)%(a-b) != 0) day++;
    if (a >= v) cout << 1 << "\n";
    else cout << day << "\n";
    return 0;
}