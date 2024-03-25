#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, m;
    cin >> n;
    unordered_map<int, int> cards;
    for (int i = 0; i < n; i++) {
        int sang_card;
        cin >> sang_card;
        cards[sang_card]++;
    }
    cin >> m;
    for (int i = 0; i < m; i++) {
        int guess_card;
        cin >> guess_card;
        cout << cards[guess_card] << " ";
    }
    return 0;
}