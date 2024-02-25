#include <iostream>
using namespace std;

int main() {
	int A;
	cin >> A;

	if (A >= 90) {
		cout << "A" << endl;
	}

	else if (A >= 80) {
		cout << "B" << endl;
	}

	else if (A >= 70) {
		cout << "C" << endl;
	}

	else if (A >= 60) {
		cout << "D" << endl;
	}

	else {
		cout << "F" << endl;
	}

	return 0;
}