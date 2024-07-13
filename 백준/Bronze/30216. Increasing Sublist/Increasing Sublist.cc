#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    
    vector<int> nums(n);
    for (int i = 0; i < n; i++) cin >> nums[i];

    int maxLen = 1;
    vector<int> dp(n, 1);

    for (int i = 1; i < n; i++) {
        if (nums[i] > nums[i - 1]) {
            dp[i] = dp[i - 1] + 1;
            maxLen = max(maxLen, dp[i]);
        }
    }

    cout << maxLen << '\n';

    return 0;
}