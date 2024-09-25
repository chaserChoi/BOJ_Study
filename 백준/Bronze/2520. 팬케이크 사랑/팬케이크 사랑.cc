#include <iostream>
#include <algorithm>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int t; 
  cin >> t;
    
  while (t--) {
    int cm, y, ssu, ssa, f; cin >> cm >> y >> ssu >> ssa >> f;
    int b, gs, gc, w; cin >> b >> gs >> gc >> w;

    cout << min({cm*2, y*2, ssu*4, ssa*16, f*16/9, b+gs/30+gc/25+w/10}) << "\n";
  };
    
  return 0;
}