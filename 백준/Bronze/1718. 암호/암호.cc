#include <iostream>
#include <string>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    string plain, key;
    getline(cin, plain);
    cin >> key;
    string cipher;
    int idx = 0;

    for (int i = 0; i < plain.length(); i++)
    {
        if (plain[i] == ' ')
            cipher += ' ';
        else if ((plain[i] - '0') - (key[idx] - '0') <= 0)
            cipher += (plain[i] - '0') - (key[idx] - '0') - 1 + 26 + 'a';
        else
            cipher += (plain[i] - '0') - (key[idx] - '0') - 1 + 'a';

        idx = (idx + 1) % key.length();
    }
    cout << cipher << "\n";

    return 0;
}