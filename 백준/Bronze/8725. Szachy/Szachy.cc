#include <bits/stdc++.h>
using namespace std;

#define MAX 1'000'001

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n;
  cin >> n;
  int ans = 0;
    
  for (int i = 0; i < n; i++) {
    int rowMax = -MAX;
    for (int j = 0; j < n; j++) {
      int score; 
      cin >> score;
      rowMax = max(rowMax, score);
    }
      
    ans += max(0, rowMax);
  }

  cout << ans << "\n";

  return 0;
}