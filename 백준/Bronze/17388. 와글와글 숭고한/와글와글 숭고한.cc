#include <iostream>
using namespace std;

int main() {
    int arr[3] = {};
    for (int i = 0; i < 3; i++) cin >> arr[i];
    int min = arr[0];
    if (arr[0]+arr[1]+arr[2] < 100) {
        for (int i = 1; i <= 2; i++) {
            if (min > arr[i]) min = arr[i];
        }
        if (min == arr[0]) cout << "Soongsil" << "\n";
        else if (min == arr[1]) cout << "Korea" << "\n";
        else cout << "Hanyang" << "\n";
    }
    else cout << "OK" << "\n";
    return 0;
}