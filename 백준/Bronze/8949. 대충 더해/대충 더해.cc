#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string a, b; 
  cin >> a >> b;
  reverse(a.begin(), a.end());
  reverse(b.begin(), b.end());

  vector<int> result;
  for (int i = 0; i < max(a.length(), b.length()); i++) {
    int digitA = (i < a.length()) ? a[i] - '0' : 0;
    int digitB = (i < b.length()) ? b[i] - '0' : 0;
    result.push_back(digitA + digitB);
  }

  reverse(result.begin(), result.end());
    
  for (int i = 0; i < result.size(); i++) cout << result[i];
    
  return 0;
}