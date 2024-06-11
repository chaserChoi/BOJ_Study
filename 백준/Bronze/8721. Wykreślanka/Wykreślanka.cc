#include <iostream>
#include <vector>
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
    
  int n; cin >> n;
  vector<int> a(n);
  for (int i=0; i<n; i++) cin >> a[i];

  int ans = 0, cur = 1;
  for (int x : a) {
    if (x == cur) cur++;
    else ans++;
  }
  cout << ans;

  return 0;
}