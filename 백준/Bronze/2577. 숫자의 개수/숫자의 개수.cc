#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    int num_arr[10] = { 0, };
    cin >> A >> B >> C;
    string mul = to_string(A*B*C);
    for (int i = 0; i < mul.length(); i++) {
        num_arr[mul[i]-'0']++;
    }
    for (int i = 0; i < 10; i++) cout << num_arr[i] << "\n";
    return 0;
}