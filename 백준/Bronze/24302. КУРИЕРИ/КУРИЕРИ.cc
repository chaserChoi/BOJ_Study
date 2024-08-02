#include <algorithm>
#include <iomanip>
#include <iostream>
using namespace std;

double calc1(double n) {
  if (n <= 5) return 4;
  if (n <= 10) return 7;
  if (n <= 20) return 12;
  if (n <= 30) return 17;
  return n * 0.57;
}

double calc2(double m) {
  if (m <= 2) return 0.9 + m * 0.9;
  if (m <= 5) return 1 + m * 0.85;
  if (m <= 20) return 1.25 + m * 0.8;
  if (m <= 40) return 3.25 + m * 0.7;
  return 9.25 + m * 0.55;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n, m; 
  cin >> n >> m;
  n /= 1000; 
  m /= 1000;

  cout << fixed << setprecision(2) << min(calc1(n), calc2(n)) + min(calc1(m), calc2(m));
  return 0;
}