#include <iostream>
using namespace std;

int main() {
	int A, B, C;
	cin >> A >> B;
	cin >> C;
	
	B += C;
	if (B / 60 >= 1) {
		A += B / 60;
		B -= 60 * (B / 60);
		if (A / 24 >= 1) {
			A -= 24 * (A / 24);
		}
	}

	cout << A << " " << B << endl;

	return 0;
}