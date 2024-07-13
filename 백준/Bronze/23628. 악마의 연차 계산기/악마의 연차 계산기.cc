#include <iostream>
#include <cmath>
using namespace std;

int main(void) {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int Syear, Smonth, Sday, Eyear, Emonth, Eday;
    cin >> Syear >> Smonth >> Sday >> Eyear >> Emonth >> Eday;

    int total = 0;
    int vacation = 0;
    int annual = 0;

    total = (Eyear - Syear) * 360 + (Emonth - Smonth) * 30 + (Eday - Sday);

    int monthCnt = (Eyear - Syear) * 12 + (Emonth - Smonth);
    vacation = min(monthCnt, 36);

    int a = total / 360;
    for (int i = 1; i <= a; i++) {
        int temp = i;
        if (temp % 2 == 0) temp--;
        int b = temp - (temp / 2 + 1);
        annual += b + 15;
    }

    cout << annual << ' ' << vacation << '\n' << total << "days" << '\n';

    return 0;
}
