#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int K;
    cin >> K;
    for (int k = 1; k <= K; k++) {
        int n;
        cin >> n;
        
        vector<int> fares(n - 1);
        for (int i = 0; i < n - 1; i++)
            cin >> fares[i];
            
        unordered_map<string, int> stationIdx;
        vector<string> stations(n);
        for (int i = 0; i < n; i++) {
            cin >> stations[i];
            stationIdx[stations[i]] = i;
        }
        
        string start, end;
        cin >> start >> end;
        
        int startIdx = stationIdx[start];
        int endIdx = stationIdx[end];
        
        int dist = abs(endIdx - startIdx);
        int f = fares[dist - 1];
        
        cout << "Data Set " << k << ":\n";
        cout << f << "\n\n";
    }
    
    return 0;
}