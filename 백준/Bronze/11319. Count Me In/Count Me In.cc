#include <iostream>
#include <string>
using namespace std;

int main() {
    int S;
    cin >> S;
    getchar();
    while (S--) {
        string str;
        getline(cin, str);
        int consonant = 0, vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') vowel++;
            else if (str[i] != ' ') consonant++;
        }
        cout << consonant << " " << vowel << "\n";
    }
    return 0;
}