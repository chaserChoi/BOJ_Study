#include <iostream>
#include <cctype>
using namespace std;

int main() {
	char input[101];
	int cnt = 0;
	cin >> input;

	while (input[cnt]) {
		if (isupper(input[cnt])) {
			input[cnt] = tolower(input[cnt]);
		}
		else if (islower(input[cnt])) {
			input[cnt] = toupper(input[cnt]);
		}
		cnt++;
	}

	cout << input << "\n";

	return 0;
}