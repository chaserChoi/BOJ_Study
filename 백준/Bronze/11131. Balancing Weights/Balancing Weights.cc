#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T; 
  cin >> T;

  for (int i = 0; i < T; i++) {
    int n; 
    cin >> n;

    vector<int> w(n);
    for (int j = 0; j < n; j++)
      cin >> w[j];

    int torque = 0;
    for (int j = 0; j < n; j++)
      torque += 100 * w[j];

    if (torque == 0) cout << "Equilibrium\n";
    else if (torque > 0) cout << "Right\n";
    else cout << "Left\n";
  }

  return 0;
}