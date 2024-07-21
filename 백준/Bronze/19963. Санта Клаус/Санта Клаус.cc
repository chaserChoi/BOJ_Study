#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n, m, k; 
  cin >> n >> m >> k;
  vector<bool> v(n + 1, true);
  for (int i=0; i<m+k; i++) {
    int x; 
    cin >> x;
    v[x] = false;
  }

  cout << n - m - k << "\n";
    
  for (int i = 1; i <= n; i++) {
    if (v[i]) cout << i << " ";
  }
    
  return 0;
}