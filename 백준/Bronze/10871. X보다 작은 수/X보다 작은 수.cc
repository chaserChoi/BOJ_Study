#include <iostream>
using namespace std;

int main() {
	int N, X, a;
	int i, j;
	int A[10000] = {};
	cin >> N >> X;

	for (i = 0; i < N; i++) {
		cin >> A[i];
	}

	for (j = 0; j < N; j++) {
		if (A[j] < X) {
			cout << A[j] << " ";
		}
	}
	
	return 0;
}