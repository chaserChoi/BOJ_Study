#include <iostream>
using namespace std;

void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int n, m;
    cin >> n >> m;
    int arr[101] = {};
    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }

    for (int j = 0; j < m; j++) {
        int start, end;
        cin >> start >> end;
        start--;
        end--;
        for (int k = end; k > start; k--) {
            for (int z = start; z < k; z++) {
                swap(arr[z], arr[z + 1]);
            }
        }
    }

    for (int q = 0; q < n; q++) {
        cout << arr[q] << " ";
    }

	return 0;
}