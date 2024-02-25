#include <iostream>
using namespace std;

int main() {
	int num[8];
	int asc = 0;
	int des = 0;
	
	for (int i = 0; i < 8; i++) {
		cin >> num[i];
		if (num[i] == i + 1) {
			asc++;
		}
		else if (num[i] == 8 - i) {
			des++;
		}
	}

	if (asc == 8) {
		cout << "ascending" << "\n";
	}
	else if (des == 8) {
		cout << "descending" << "\n";
	}
	else {
		cout << "mixed" << "\n";
	}
	
	return 0;
}