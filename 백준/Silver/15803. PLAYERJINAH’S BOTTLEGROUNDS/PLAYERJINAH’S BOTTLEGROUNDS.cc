#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int x, y;
    vector<pair<int, int>> v(3);

    for (int i = 0; i < 3; i++) {
        cin >> x >> y;
        v[i] = {x, y};
    }

    bool flag = true;
    int dx = v[1].first - v[0].first;
    int dy = v[1].second - v[0].second;
    for (int i = 2; i < 3; i++) {
        if ((v[i].first - v[0].first) * dy != (v[i].second - v[0].second) * dx) {
            flag = false;
            break;
        }
    }

    if (flag) cout << "WHERE IS MY CHICKEN?" << '\n';
    else cout << "WINNER WINNER CHICKEN DINNER!" << '\n';

    return 0;
}