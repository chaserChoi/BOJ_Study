#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Climber {
    int num,
        lead,
        speed,
        boulder,
        prod,
        sum;
};

bool cmp(const Climber& a, const Climber& b) {
    if (a.prod != b.prod) return a.prod < b.prod;
    if (a.sum != b.sum) return a.sum < b.sum;
    return a.num < b.num;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    vector<Climber> climb(n);
    for (int i = 0; i < n; i++) {
        cin >> climb[i].num >> climb[i].lead >> climb[i].speed >> climb[i].boulder;
        climb[i].prod = climb[i].lead * climb[i].speed * climb[i].boulder;
        climb[i].sum = climb[i].lead + climb[i].speed + climb[i].boulder;
    }

    sort(climb.begin(), climb.end(), cmp);

    cout << climb[0].num << " " << climb[1].num << " " << climb[2].num << '\n';

    return 0;
}