#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    string line;
    while (getline(cin, line))
    {
        if (line == "#")
            break;

        stringstream ss(line);
        int curr;
        ss >> curr;
        set<int> visited;
        visited.insert(curr);
        bool illegal = false;

        string move;
        while (ss >> move)
        {
            char dir = move[0];
            int steps = move[1] - '0';

            if (dir == 'U')
                curr += steps;
            else if (dir == 'D')
                curr -= steps;

            if (curr < 1 || curr > 20 || visited.count(curr) > 0)
            {
                illegal = true;
                break;
            }

            visited.insert(curr);
        }

        if (illegal)
            cout << "illegal\n";
        else
        {
            vector<int> noVisited;
            for (int house = 1; house <= 20; house++)
            {
                if (visited.count(house) == 0)
                    noVisited.push_back(house);
            }
            if (noVisited.empty())
                cout << "none\n";
            else
            {
                for (size_t i = 0; i < noVisited.size(); i++)
                {
                    cout << noVisited[i];
                    if (i < noVisited.size() - 1)
                        cout << " ";
                }
                cout << "\n";
            }
        }
    }

    return 0;
}