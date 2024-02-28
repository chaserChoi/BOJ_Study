#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    int H, W, N;
    while (T--) {
        cin >> H >> W >> N;
        int floor = N % H;
        int room = N / H + 1;
        if (floor == 0) {
            floor = H;
            room--;
        }
        cout << floor * 100 + room << "\n";
    }
    return 0;
}