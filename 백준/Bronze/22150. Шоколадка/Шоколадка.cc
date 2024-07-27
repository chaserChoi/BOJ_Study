#include <iostream>
#include <vector>
using namespace std;

bool canForm() {
  int n; 
  cin >> n;
  vector<int> l(n), r(n);
  for (int i = 0; i < n; i++) cin >> l[i] >> r[i];

  for (int i = 0; i < n; i++) 
    if (l[i] > n || r[i] > n || l[i] + r[i] != n) return true;
  
  return false;
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int t; 
  cin >> t;
    
  while (t--) 
    cout << (canForm() ? "yes" : "no") << "\n";
    
  return 0;
}