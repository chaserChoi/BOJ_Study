#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n; 
  cin >> n;

  vector<int> odd;
  vector<int> even;
    
  for (int i = 0; i < n; i++) {
    int x; 
    cin >> x;
      
    if (x % 2 == 0) 
      even.push_back(x);
    else 
      odd.push_back(x);
  }
    
  sort(odd.begin(), odd.end(), greater<int>());
  sort(even.begin(), even.end(), greater<int>());

  int ans = 0;
  for (int i = 0; i < even.size(); i++) 
    ans += even[i];
  for (int i = 1; i < odd.size(); i += 2) 
    ans += odd[i] + odd[i - 1];
    
  cout << ans / 2;
    
  return 0;
}