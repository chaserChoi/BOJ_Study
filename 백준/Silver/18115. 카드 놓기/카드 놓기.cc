#include <iostream>
#include <deque>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    deque<int> dq;
    int* skills = new int[N];
    for (int i = 0; i < N; i++) cin >> skills[i];
    for (int i = N - 1; i >= 0; i--) {
        if (skills[i] == 1) dq.push_front(N - i);
        else if (skills[i] == 2) {
            int top = dq.front();
            dq.pop_front();
            dq.push_front(N - i);
            dq.push_front(top);
        } else if (skills[i] == 3) dq.push_back(N - i);
    }
    for (auto card : dq) cout << card << " ";
    delete[] skills;
    return 0;
}