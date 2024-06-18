// BOJ 17219 비밀번호 찾기
#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N, M;
    cin >> N >> M;

    unordered_map<string, string> um;

    for (int i = 0; i < N; i++) {
        string site, pswd;
        cin >> site >> pswd;
        um[site] = pswd;
    }

    for (int i = 0; i < M; i++) {
        string site;
        cin >> site;
        cout << um[site] << '\n';
    }

    return 0;
} 