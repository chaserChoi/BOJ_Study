#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n; 
  cin >> n;
  string s; 
  cin >> s;

  vector<int> cnt(26, 0);
    
  for (char c : s) cnt[c - 'A']++;
  
  cout << min({cnt['H'-'A'], cnt['I'-'A'], cnt['A'-'A'], cnt['R'-'A'], cnt['C'-'A']});
    
  return 0;
}