#include <iostream>
using namespace std;

int main() {
	long long N, M;
	cin >> N >> M;

	if ( N - M < 0 ) cout << (N - M) * (-1) << "\n";
	else cout << N - M << "\n";

	return 0;
}