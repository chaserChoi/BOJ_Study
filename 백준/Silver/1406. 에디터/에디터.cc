#include <iostream>
#include <list>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string str;
    int m;
    cin >> str;
    list<char> L;
    for (auto c : str) L.push_back(c);
    auto cursor = L.end();
    cin >> m;
    while (m--) {
        char cmd;
        cin >> cmd;
        if (cmd == 'P') {
            char add;
            cin >> add;
            L.insert(cursor, add);
        }
        else if (cmd == 'L') {
            if (cursor != L.begin()) cursor--;
        }
        else if (cmd == 'D') {
            if (cursor != L.end()) cursor++;
        }
        else {
            if (cursor != L.begin()) {
                cursor--;
                cursor = L.erase(cursor);
            }
        }
    }
    for (auto c : L) cout << c;
    return 0;
}