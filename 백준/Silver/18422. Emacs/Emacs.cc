#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;

    vector<string> grid(n);
    for (int i = 0; i < n; i++)
        cin >> grid[i];

    int rectCnt = 0;
    vector<vector<bool>> visited(n, vector<bool>(m , false));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '*' && !visited[i][j]) {
                rectCnt++;

                int x = i, y = j;

                while (x < n && grid[x][j] == '*')
                    x++;
                while (y < m && grid[i][y] == '*')
                    y++;

                for (int r = i; r < x; r++) {
                    for (int c = j; c < y; c++)
                        visited[r][c] = true;
                }
            }
        }
    }

    cout << rectCnt << '\n';

    return 0;
}