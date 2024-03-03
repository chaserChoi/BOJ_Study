#include <iostream>
using namespace std;

int main() {
    int n, q;
    cin >> n >> q;
    long long arr[n] = {};
    int query;
    for (int i = 0; i < n; i++) cin >> arr[i];
    while (q--) {
        int a, b, c, d;
        long long sum = 0, sum1 = 0, sum2 = 0;
        long long temp;
        cin >> query;
        switch (query) {
            case 1: 
                cin >> a >> b;
                for (int i = a-1; i < b; i++) sum += arr[i];
                cout << sum << "\n";
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                break;
            case 2: 
                cin >> a >> b >> c >> d;
                for (int i = a-1; i < b; i++) sum1 += arr[i];
                for (int i = c-1; i < d; i++) sum2 += arr[i];
                cout << sum1 - sum2 << "\n";
                break;
            default:
                break;
        }
    }
    return 0;
}