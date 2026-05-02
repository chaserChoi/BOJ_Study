class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // a, b 같아질 때까지 반복 (서로 맞붙을 때까지)
        while (a != b) {
            // 다음 라운드 번호 갱신 
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
            // 라운드 수 증가
            answer++;
        }

        return answer;
    }
}