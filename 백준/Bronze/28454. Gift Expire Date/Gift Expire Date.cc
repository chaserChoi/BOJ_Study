#include <iostream>
#include <string>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  string cur; 
  cin >> cur;
    
  int n; 
  cin >> n;

  int cnt = 0;
    
  for (int i = 0; i < n; i++) {
    string expire; 
    cin >> expire;
      
    if (expire >= cur) cnt++;
  }
    
  cout << cnt;
    
  return 0;
}