#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>
using namespace std;

int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    vector<int> nums(10);
    int sum = 0;

    for (int i = 0; i < 10; i++) {
        cin >> nums[i];
        sum += nums[i];
    }

    int avg = sum / 10;
    unordered_map<int, int> freq;
    for (int num : nums) freq[num]++;

    int maxFreq = 0;
    int m = 0;
    for (auto [num, cnt] : freq) {
        if (cnt > maxFreq) {
            maxFreq = cnt;
            m = num;
        }
    }

    cout << avg << '\n' << m << '\n';

    return 0;
}
