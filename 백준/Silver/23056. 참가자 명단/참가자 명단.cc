#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <tuple>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;

    vector<tuple<int, int, int, string>> members;
    vector<int> s(n + 1, 0);

    for (int i = 0; i < 500; i++) {
        int classroom;
        string name;
        cin >> classroom >> name;
        if (classroom == 0 && name == "0")
            break;

        int x = (classroom % 2 == 0) ? 1 : 0;
        if (s[classroom] < m) {
            members.emplace_back(x, classroom, name.length(), name);
            s[classroom]++;
        }
    }

    sort(members.begin(), members.end());

    for (const auto &member : members)
        cout << get<1>(member) << " " << get<3>(member) << endl;

    return 0;
}
