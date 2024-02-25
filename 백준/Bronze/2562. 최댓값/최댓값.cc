#include <iostream>
using namespace std;

int main() {
	int arr[9] = {};
	int max = arr[0];
	int cnt = 0, max_cnt = 0;

	for (int i = 0; i < 9; i++) {
		cin >> arr[i];
	}

	for (cnt; cnt < 9; cnt++) {
		if (arr[cnt] >= max) {
			max = arr[cnt];
			max_cnt = cnt + 1;
		}
	}

	cout << max << "\n" << max_cnt << "\n";
	
	return 0;
}