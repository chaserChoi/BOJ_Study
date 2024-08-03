#include <iostream>
#include <algorithm>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n, a, b, c; 
  cin >> n >> a >> b >> c;

  int total = min(a, b) + (n - 2) * min({a, b, c});
    
  if (n < 2)
    cout << 0 << " " << 0 << '\n';
  else
    cout << total / 100 << " " << total % 100 << '\n';
    
  return 0;
}