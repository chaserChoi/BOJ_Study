#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int k;
    cin >> k;
    for (int i = 1; i <= k; i++) {
        int m, n;
        cin >> m >> n; 

        vector<int> densities(m); 
        for (int j = 0; j < m; j++) 
            cin >> densities[j]; 

        long long total = 0; 

        for (int j = 0; j < n; j++) {
            int h, w, d, idx;
            cin >> h >> w >> d >> idx; 

            long long vol = static_cast<long long>(h) * w * d; 

            total += vol * densities[idx - 1]; 
        }

        cout << "Data Set " << i << ":\n";
        cout << total << "\n";
    }

    return 0;
}
