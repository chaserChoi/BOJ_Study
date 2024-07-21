#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n, m, a; 
  cin >> n >> m >> a;
  vector<vector<int>> arr(n, vector<int>(m));
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) cin >> arr[i][j];   
  }

  int total = 0;
  for (int i = 1; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (arr[i][j] > arr[i - 1][j] * 2) total += a;
    }
  }
    
  cout << total;
    
  return 0;
}