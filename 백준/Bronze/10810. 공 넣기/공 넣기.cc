#include <iostream>
using namespace std;

int main() {
	int N, M;
	int N_arr[101] = {0};
	int i, j, k;
	cin >> N >> M;

	for (int cnt = 0; cnt < M; cnt++) {
		cin >> i >> j >> k;
		for (i = i - 1; i < j; i++) {
			N_arr[i] = k;
		}
	}

	for (int cnt = 0; cnt < N; cnt++) {
		if (N_arr[cnt] == NULL) {
			cout << "0" << " ";
		}
		else {
			cout << N_arr[cnt] << " ";
		}
	}

	return 0;
}