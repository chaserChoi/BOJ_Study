#include <iostream>
using namespace std;

int main() {
	int N, line;
	cin >> N;
	line = 1;

	for (int i = 0; i < N; i++) {
		for (int j = N; j > 0; j--) {
			if (j <= line) {
				cout << "*";
			}
			else {
				cout << " ";
			}
		}
		line++;
		cout << "\n";
	}

	return 0;
}