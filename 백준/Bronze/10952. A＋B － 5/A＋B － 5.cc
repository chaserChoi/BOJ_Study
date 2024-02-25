#include <iostream>
using namespace std;

int main() {
	int A, B;
	
	for (;;) {
		cin >> A >> B;
		if (A != 0 && B != 0) {
			cout << A + B << "\n";
		}
		else {
			break;
		}
	}

	return 0;
}