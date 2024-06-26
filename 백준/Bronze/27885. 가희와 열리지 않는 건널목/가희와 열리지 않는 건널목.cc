#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int c, h;
    cin >> c >> h;
    vector<int> times;
    for (int i = 0; i < c + h; i++) {
        int h, m, s;
        char colon;
        cin >> h >> colon >> m >> colon >> s;
        times.push_back(h * 3600 + m * 60 + s);
    }

    sort(times.begin(), times.end());

    int prev = -40;
    int total = 0;
    for (int time : times) {
        int pass;
        if (time - prev >= 40) pass = 40;
        else pass = time - prev;

        total += pass;
        prev = time;
    }

    cout << 86400 - total << '\n';

    return 0;
}