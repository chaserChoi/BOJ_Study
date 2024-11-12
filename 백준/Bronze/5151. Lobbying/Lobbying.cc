#include <iostream>
#include <vector>
#include <iomanip> 
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int K;
    cin >> K; 
    for (int k = 1; k <= K; k++) {
        int n, m, T;
        cin >> n >> m >> T; 

        vector<double> donations(n, 0.0); 

        for (int i = 0; i < m; i++) {
            int lawmakerIndex, donationDay;
            double amount;
            cin >> lawmakerIndex >> donationDay >> amount;
            lawmakerIndex--;

            if (T - donationDay >= 0 && T - donationDay < 1000) {
                donations[lawmakerIndex] += amount;
            }
        }

        double votesFor = 0.0;
        double votesAgainst = 0.0;

        for (int i = 0; i < n; i++) {
            char vote;
            cin >> vote;
            if (vote == 'Y') {
                votesFor += 1.0; 
            } else if (vote == 'N') {
                double D = donations[i];
                votesAgainst += 1.0 / (1.0 + (D / 10000.0));
            }
        }

        cout << "Data Set " << k << ":\n";
        cout << fixed << setprecision(2) << votesFor << " " << votesAgainst << "\n\n";
    }

    return 0;
}
