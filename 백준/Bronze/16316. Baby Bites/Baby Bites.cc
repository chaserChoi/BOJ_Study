#include <iostream>
#include <string>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    bool makeSense = true;

    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        if (s != "mumble" && stoi(s) != i + 1)
            makeSense = false;
    }

    cout << (makeSense ? "makes sense" : "something is fishy");

    return 0;
}