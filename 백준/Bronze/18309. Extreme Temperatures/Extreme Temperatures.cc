#include <iostream>
#include <algorithm>
#include <sstream>
#include <string>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string s;

  int mn = 50, mx = -50;
  while (getline(cin, s)) {
    stringstream ss(s);
    string t; ss >> t;
    while (ss >> t) {
      int x = stoi(t);
      mn = min(mn, x);
      mx = max(mx, x);
    }
  }
    
  cout << mn << " " << mx;
    
  return 0;
}