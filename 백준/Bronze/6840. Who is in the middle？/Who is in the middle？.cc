#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int arr[3] = {};
    for (int i = 0; i < 3; i++) cin >> arr[i];
    for (int i = 0; i < 2; i++) {
        for (int j = i+1; j < 3; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << arr[1] << "\n";
    return 0;
}