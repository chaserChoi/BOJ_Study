#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n, m; 
  cin >> n >> m;

  for (int i = 0; i < n; i++) {
    for (int j = 1; j <= m; j++) {
      cout << i * m + j;
      if (j < m) cout << " ";
    }
    cout << "\n";
  }
    
  return 0;
}