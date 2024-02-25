#include <iostream>
using namespace std;

int main() {
	int N, M;
	int N_arr[101] = {0};
	int i, j, change;
	int no = 1;
	cin >> N >> M;

	for (int num = 0; num < N; num++) {
		N_arr[num] = no + num;
	}

	for (int cnt = 0; cnt < M; cnt++) {
		cin >> i >> j;
		change = N_arr[i - 1];
		N_arr[i - 1] = N_arr[j - 1];
		N_arr[j - 1] = change;
	}

	for (int cnt = 0; cnt < N; cnt++) {
		cout << N_arr[cnt] << " ";
	}

	return 0;
}