#include <iomanip>
#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n; 
  cin >> n;
  double total = 0;
    
  for (int i = 0; i < n; i++) {
    double q, y;
    cin >> q >> y;
    total += q * y;
  }
    
  cout << fixed << setprecision(4) << total;
    
  return 0;
}