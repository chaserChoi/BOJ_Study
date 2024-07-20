#include <iostream>
#include <vector>
using namespace std;

bool isPrime(int n) {
  for (int i = 2; i < n; i++) {
    if (!(n % i)) return false;
  }
  return true;
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n; 
  cin >> n;

  vector<int> a(n);
  a[0] = 1; 
  a[1] = 2;
    
  for (int i = 2; i < n; i++) a[i] = i + 1;
    
  while (!isPrime(a[n - 1])) a[n - 1]++;

  cout << n << "\n";
  for (int i = 0; i < n; i++) cout << a[i] << " ";
    
  return 0;
}