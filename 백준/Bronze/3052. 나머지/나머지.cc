#include <iostream>
using namespace std;

int main() {
	int arr1[10] = {};
	int cnt = 0;
	int n;
	int i;

	for (int i = 0; i < 10; i++) {
		cin >> n;
		arr1[i] = n % 42;
	}

	for (int i = 0; i < 10; i++) {
		if (arr1[i] != -1) {
			cnt = cnt + 1;
		}
		for (int j = i + 1; j < 10; j++) {
			if (arr1[i] == arr1[j]) {
				arr1[j] = -1;
			}
		}
	}
	cout << cnt << "\n";

	return 0;
}