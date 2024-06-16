#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string S;
    int result = 0;
    int cnt = 0;
    int check = 0;
    cin >> S;

    for (int i = 0; i < S.size() - 2; i++) {
        if (S.at(i) + 1 == S.at(i + 1) && S.at(i + 1) + 1 == S.at(i + 2)) {
            if (i + 3 < S.size() && (S.at(i + 2) + 1 == S.at(i + 3))) 
                while (i < S.size() - 1 && S.at(i) + 1 == S.at(i + 1)) i++;
            else result++;
        }
    }

    cout << result << '\n';

    return 0;
}