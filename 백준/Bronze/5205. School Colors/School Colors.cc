#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
using namespace std;

struct Color {
    int r, g, b;
};

double calcContrast(const Color& c1, const Color& c2) {
    return sqrt(pow(c1.r - c2.r, 2) + pow(c1.g - c2.g, 2) + pow(c1.b - c2.b, 2));
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int K;
    cin >> K;
    for (int k = 1; k <= K; k++) {
        int n;
        cin >> n;
        
        vector<Color> colors(n);
        for (int i = 0; i < n; i++)
            cin >> colors[i].r >> colors[i].g >> colors[i].b;
            
        double maxContrast = 0.0;
        vector<pair<int, int>> best;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double contrast = calcContrast(colors[i], colors[j]);
                if (contrast > maxContrast) {
                    maxContrast = contrast;
                    best.clear();
                    best.push_back({i + 1, j + 1});
                } else if (contrast == maxContrast)
                    best.push_back({i + 1, j + 1});
            }
        }
        
        cout << "Data Set " << k << ":\n";
        for (const auto& p : best)
            cout << p.first << " " << p.second << '\n';
    }
    
    return 0;
}