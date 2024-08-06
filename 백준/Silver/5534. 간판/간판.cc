#include<iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(0);
    
    int N;
	cin >> N;
    string cur;
	cin >> cur;

    int ans = 0;

	string reused;
	for (int i = 0; i < N; i++) {
		bool isFound = false;		
		cin >> reused;

		for (int j = 0; j < reused.size() - cur.size() + 1; j++) {
			if (reused[j] != cur[0]) continue;
			
			int k;
			for (k = j + 1; k < reused.size(); k++) {
				if (reused[k] != cur[1]) continue;
				int interval = k - j;
				int curIdx = 2;
				int reusedIdx = k + interval;

				int cnt = 2;
				while (true) {
					if (reusedIdx >= reused.size() || cnt == cur.size()) break;
					if (reused[reusedIdx] != cur[curIdx++]) break;
					cnt++;
					reusedIdx += interval;
				}

				if (cnt == cur.size()) {
					isFound = true;
					ans++;
					break;
				}
			}

			if (isFound == true) break;
		}
	}
    
	cout << ans;

	return 0;
}