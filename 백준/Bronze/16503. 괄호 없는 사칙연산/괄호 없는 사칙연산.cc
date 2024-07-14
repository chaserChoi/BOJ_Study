#include <algorithm>
#include <iostream>
using namespace std;

int calc(int a, int b, char op) {
  if (op == '+') return a + b;
  else if (op == '-') return a - b;
  else if (op == '*') return a * b;
  else if (op == '/') return a / b;
    
  return 0;
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int k1, k2, k3; 
  char op1, op2;
  cin >> k1 >> op1 >> k2 >> op2 >> k3;

  int c1 = calc(calc(k1, k2, op1), k3, op2);
  int c2 = calc(k1, calc(k2, k3, op2), op1);
    
  cout << min(c1, c2) << "\n" << max(c1, c2);
    
  return 0;
}