#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main() {
	int T;
	string str1, str2, str3;
	cin >> T;
	cin >> str1;
	cin >> str2;
	cin >> str3;

	cout << str1[0] << str1[str1.length() - 1] << "\n";
	cout << str2[0] << str2[str2.length() - 1] << "\n";
	cout << str3[0] << str3[str3.length() - 1] << "\n";

	return 0;
}