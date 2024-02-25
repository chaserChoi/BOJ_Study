#include <iostream>
using namespace std;

int main() {
	int n, fac;
	cin >> n;
	fac = 1;

	while (n > 0) {
		fac *= n;
		n--;
	}

	cout << fac << "\n";

	return 0;
}