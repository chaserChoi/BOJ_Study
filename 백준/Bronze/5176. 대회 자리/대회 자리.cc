#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int k;
    cin >> k; 
    while (k--) {
        int p, m;
        cin >> p >> m; 

        vector<int> preferred(p); 
        for (int i = 0; i < p; i++) 
            cin >> preferred[i];

        unordered_set<int> occupied; 
        int unable = 0; 

        for (int i = 0; i < p; i++) {
            int seat = preferred[i];
            
            if (occupied.find(seat) != occupied.end()) 
                unable++; 
            else 
                occupied.insert(seat); 
        }

        cout << unable << "\n";
    }

    return 0;
}
