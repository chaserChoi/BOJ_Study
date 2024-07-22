#include <iostream>
#include <string>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  long long ans = 0;

  string s;
  while (cin >> s) 
    ans += stoll(s.substr(0, s.length() - 3)) * 100 + stoll(s.substr(s.length() - 2, 2));
    
  cout << ans / 100 << "." << (ans % 100 < 10 ? "0" : "") << ans % 100;
    
  return 0;
}