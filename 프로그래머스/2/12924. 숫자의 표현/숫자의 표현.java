class Solution {
    public int solution(int n) {
        int start = 1;
        int end = start;
        int total = 1;
        int cnt = 0;
        while (start <= end && end <= n) {
            if (total == n) {
                cnt++;
                end++; // 또는 start++;
                total += end; // 또는 total += start;
            } else if (total < n) {
                end++;
                total += end;
            } else {
                total -= start;
                start++;
            }
        }

        return cnt;
    }
}