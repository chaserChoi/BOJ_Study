#include <iostream>
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int z; 
  cin >> z;
    
  while (z--) {
    int n; 
    cin >> n;

    cout << "ABCBCDCDADAB"[(n-1) % 12] << "\n";
  };
    
  return 0;
}