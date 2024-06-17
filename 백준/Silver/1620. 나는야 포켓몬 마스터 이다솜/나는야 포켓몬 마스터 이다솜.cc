#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, M;
    cin >> N >> M;

    unordered_map<string, int> pokemonMap;
    vector<string> pokemonName(N + 1);

    for (int i = 1; i <= N; i++) {
        string name;
        cin >> name;
        pokemonMap[name] = i;
        pokemonName[i] = name;
    }

    for (int i = 0; i < M; i++) {
        string cmd;
        cin >> cmd;

        if (isdigit(cmd[0])) {
            int num = stoi(cmd);
            cout << pokemonName[num] << '\n';
        } else
            cout << pokemonMap[cmd] << '\n';
    }

    return 0;
}