#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;

    int top = 0;

    while (n--) {
        vector<int> scores(7);
        
        for (int i = 0; i < 7; i++) cin >> scores[i];
        
        int max_run = max(scores[0], scores[1]);

        vector<int> tricks(scores.begin() + 2, scores.end());
        sort(tricks.rbegin(), tricks.rend());

        int top_two = tricks[0] + tricks[1];

        int final_score = max_run + top_two;

        top = max(top, final_score);
    }

    cout << top << "\n";
    
    return 0;
}
