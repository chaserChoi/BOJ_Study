#include <algorithm>
#include <iostream>
using namespace std;

int rgb(int a, int c, int r, int g, int b) {
  return a * (r * r + g * g + b * b) + c * min({r, g, b});
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int t; 
  cin >> t;
  while (t--) {
    int a, c; 
    cin >> a >> c;
    int r, g, b; 
    cin >> r >> g >> b;

    int x = rgb(a, c, r + 1, g, b);
    int y = rgb(a, c, r, g + 1, b);
    int z = rgb(a, c, r, g, b + 1);
  
    cout << (x >= y && x >= z ? "RED" : y >= z ? "GREEN" : "BLUE") << "\n";
  }
    
  return 0;
}