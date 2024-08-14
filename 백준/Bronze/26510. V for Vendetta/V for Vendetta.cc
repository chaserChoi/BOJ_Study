#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n;
    
  while (cin >> n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < i; j++) cout << " ";
      cout << "*";
      for (int j = 0; j < 2 * (n - i - 1) - 1; j++) cout << " ";
      cout << "*\n";
    }
    for (int i = 0; i < n - 1; i++) cout << " ";
    cout << "*\n";
  };
    
  return 0;
}