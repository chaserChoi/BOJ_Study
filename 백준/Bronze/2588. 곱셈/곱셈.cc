#include <iostream>
using namespace std;

int main() {
	int a, b;
	int c, d, e, result;
	cin >> a >> b;

	c = a * (b % 10);
	d = a * ((b / 10) % 10);
	e = a * (b / 100);
	result = c + (d * 10) + (e * 100);

	cout << c << endl << d << endl << e << endl << result << endl;
	return 0;
}