#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);

  int cnt = 0, n;
    
  while (cin >> n) {
    if (n > 0) cnt++;
  }
  cout << cnt;

  return 0;
}