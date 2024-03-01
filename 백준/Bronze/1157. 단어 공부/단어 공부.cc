#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    string str;
    cin >> str;
    vector<int> alpha(26, 0);
    for (int i = 0; i < str.length(); i++) {
        if (str[i] >= 'a' && str[i] <= 'z') alpha[str[i] - 'a']++;
        else alpha[str[i] - 'A']++;
    }
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < alpha.size(); i++) {
        if (max < alpha[i]) {
            max = alpha[i];
            maxIndex = i;
        }
    }
    int cnt = 0;
    for (int i = 0; i < alpha.size(); i++) if (max == alpha[i]) cnt++;
    if (cnt > 1) cout << "?" << "\n";
    else cout << (char)(maxIndex + 'A') << "\n";
    return 0;
}