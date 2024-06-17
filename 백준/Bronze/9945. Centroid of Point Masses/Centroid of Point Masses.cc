#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int cnt = 1;
    while (true) {
        int N;
        cin >> N;
        if (N < 0) break;

        double sum_x = 0, sum_y = 0, sum_m = 0;
        for (int i = 0; i < N; i++) {
            double x, y, m;
            cin >> x >> y >> m;
            sum_x += x * m;
            sum_y += y * m;
            sum_m += m;
        }

        cout << "Case " << cnt << ": " << fixed << setprecision(2) << sum_x / sum_m << " " << sum_y / sum_m << "\n";
        cnt++;
        
        cin.ignore();
    }

    return 0;
}
