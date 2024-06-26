#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    string name[7];
    int num[7];

    for (int i = 0; i < 7; i++) 
        cin >> name[i] >> num[i];

    int maxApplicants = 0;
    int maxIdx = 0;
    for (int i = 0; i < 7; i++) {
        if (num[i] > maxApplicants) {
            maxApplicants = num[i];
            maxIdx = i;
        }
    }

    cout << name[maxIdx] << '\n';

    return 0;
}