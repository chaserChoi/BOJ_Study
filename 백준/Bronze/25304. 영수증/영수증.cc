#include <iostream>
using namespace std;

int main() {
	int X, N;
	int a, b;
	int sum = 0;
	cin >> X;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> a >> b;
		sum += a * b;
	}
	if (sum == X) {
		cout << "Yes" << endl;
	}
	else {
		cout << "No" << endl;
	}

	return 0;
}