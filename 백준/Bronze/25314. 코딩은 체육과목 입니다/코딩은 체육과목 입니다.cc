#include <iostream>
using namespace std;

int main() {
	int N;
	int L_num = 0;
	cin >> N;
	N = N / 4;

	for (int i = 0; i < N; i++) {
		L_num += 1;
		if (L_num != N) {
			cout << "long ";
		}
		else {
			cout << "long int" << endl;
		}
	}

	return 0;
}