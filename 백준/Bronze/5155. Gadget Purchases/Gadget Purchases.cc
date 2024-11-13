#include <iostream>
#include <vector>
#include <unordered_map>
#include <iomanip>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int K;
    cin >> K; 
    for (int k = 1; k <= K; k++) {
        int n, m;
        cin >> n >> m; 

        vector<int> purchaseCost(m), usageCost(m), maxUsage(m), revenue(m);
        for (int i = 0; i < m; i++) 
            cin >> purchaseCost[i] >> usageCost[i] >> maxUsage[i] >> revenue[i];

        vector<int> usageCount(m, 0);
        for (int i = 0; i < n; i++) {
            int machineIndex;
            cin >> machineIndex;
            usageCount[machineIndex - 1]++; 
        }

        vector<int> profitable;
        for (int i = 0; i < m; i++) {
            int actualUsage = min(usageCount[i], maxUsage[i]); 
            int totalRevenue = actualUsage * revenue[i]; 
            int totalCost = purchaseCost[i] + (actualUsage * usageCost[i]); 

            if (totalRevenue > totalCost) 
                profitable.push_back(i + 1); 
        }

        cout << "Data Set " << k << ":\n";
        for (int machine : profitable) 
            cout << machine << "\n";
        cout << "\n"; 
    }

    return 0;
}
