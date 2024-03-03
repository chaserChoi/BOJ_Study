#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    int correct = 0;
    for (int i = 0; i < 5; i++) {
        int answer;
        cin >> answer;
        if (answer == T) correct++;
    }
    cout << correct << "\n";
    return 0;
}