#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);

  int n; cin >> n;
  vector<long long> x(n);
  for (int i = 0; i < n; i++) cin >> x[i];

  long long sum = 0;
  for (int i = 1; i < n; i++) {
    sum += (x[i] - x[i - 1]) * (x[i] - x[i - 1]);
  }
    
  cout << sum << '\n';
  
  return 0;
}