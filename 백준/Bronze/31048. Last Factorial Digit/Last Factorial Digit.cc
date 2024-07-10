#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int T;
    cin >> T;

    while (T--) {
        int N;
        cin >> N;

        int last = 1;
        for (int i = 1; i <= N; i++)
            last = (last * i) % 10;

        cout << last << '\n';
    }

    return 0;
}
