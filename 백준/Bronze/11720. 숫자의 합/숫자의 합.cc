#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main() {
	int cipher;
	char num[101];
	int sum = 0;
	cin >> cipher >> num;

	for (int i = 0; i < cipher; i++) {
		sum += (num[i] - '0');
	}

	cout << sum << "\n";

	return 0;
}