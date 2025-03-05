#include <iostream>
#include <set>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n; 
  cin >> n;
  set<int> set;
    
  while (n--) {
    int g, r; 
    cin >> g >> r;
    set.insert(r);
  }
    
  cout << set.size() << '\n';
  return 0;
}