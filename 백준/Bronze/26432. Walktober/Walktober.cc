#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int t; 
  cin >> t;
    
  for (int i = 1; i <= t; i++) {
    int m, n, p; 
    cin >> m >> n >> p;
    vector<vector<int>> s(m, vector<int>(n));
      
    for (int j = 0; j < m; j++) 
      for (int k = 0; k < n; k++) 
        cin >> s[j][k];

    int ans = 0;
    for (int j = 0; j < n; j++) {
      int step = 0;
      for (int k = 0; k < m; k++) step = max(step, s[k][j] - s[p - 1][j]);
      ans += step;
    }
      
    cout << "Case #" << i << ": " << ans << "\n";
  };
    
  return 0;
}