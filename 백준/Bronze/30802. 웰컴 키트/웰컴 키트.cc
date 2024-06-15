#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    vector<int> sizes(6);
    for (int i = 0; i < 6; i++) cin >> sizes[i];

    int T, P;
    cin >> T >> P;

    int shirt = 0;
    for (int i = 0; i < 6; i++) shirt += (sizes[i] + T - 1) / T;

    int pen_bundles = N / P;
    int pen_single = N % P;

    cout << shirt << '\n';
    cout << pen_bundles << " " << pen_single << '\n';

    return 0;
}