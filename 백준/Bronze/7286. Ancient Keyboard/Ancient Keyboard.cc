#include <iostream>
#include <map>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t; 
    cin >> t;

    while (t--) {
        int n; 
        cin >> n;

        map<int, int> map;
        
        while (n--) {
            char c; 
            int a, b; 
            cin >> c >> a >> b;
            for (int i = a; i < b; i++) map[i]++;
        }

        for (auto [_, v] : map) 
            cout << (char) (v + 64);
        cout << "\n";
    }
    return 0;
}