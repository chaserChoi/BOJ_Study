#include <iostream>
using namespace std;

int main() {
	int N, x, v;
	int count = 0;
	cin >> N;

	int array[100] = { 0 };
	for (int i = 0; i < N; i++) {
		cin >> x;
		array[i] = x;
	}

	cin >> v;
	
	for (int j = 0; j < N; j++) {
		if (array[j] == v) {
			count++;
		}
	}

	cout << count << "\n";

	return 0;
}