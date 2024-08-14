#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n;
  cin >> n;

  int k = 1;
  while (k * k < n) k++;

  for (int i = 0; i < k + 2; i++) cout << "x";
  cout << "\n";
    
  for (int i = 0; i < k; i++) {
    cout << "x";
    for (int j = 0; j < k; j++) cout << ".";
    cout << "x\n";
  }
    
  for (int i = 0; i < k + 2; i++) cout << "x";
    
  return 0;
}