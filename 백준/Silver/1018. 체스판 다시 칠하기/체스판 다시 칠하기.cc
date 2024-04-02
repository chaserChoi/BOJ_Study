#include <iostream>
#include <algorithm>
using namespace std;

int N, M;
char board[50][50];

int checkBoard(int x, int y) {
    int cnt1 = 0;
    int cnt2 = 0;
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if ((i + j) % 2 == 0) {
                if (board[x+i][y+j] != 'W') cnt1++;
                if (board[x+i][y+j] != 'B') cnt2++;
            } else {
                if (board[x+i][y+j] != 'B') cnt1++;
                if (board[x+i][y+j] != 'W') cnt2++;
            }
        }
    }
    return min(cnt1, cnt2);
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> N >> M;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) cin >> board[i][j];
    }
    int answer = 1e9;
    for (int i = 0; i <= N - 8; i++) {
        for (int j = 0; j <= M - 8; j++) answer = min(answer, checkBoard(i, j));
    }
    cout << answer << "\n";
    return 0;
}