// BOJ: 2742
#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int arr[3];
    for (int i = 0; i < 3; i++) cin >> arr[i];
    int temp;
    for (int i = 0; i < 2; i++) {
        if (arr[i] > arr[i+1]) {
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
    }
    if (arr[0] > arr[1]) {
        temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
    }
    for (int i = 0; i < 3; i++) cout << arr[i] << " ";
    return 0;
}