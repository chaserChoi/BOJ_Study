import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] schedule;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        schedule = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken()); // t: 상담하는데 걸리는 일 수
            schedule[i][1] = Integer.parseInt(st.nextToken()); // p: 금액
        }

        result = 0;
        consult(0, 0); // idx: 현재 상담 날짜, pay: 현재까지 벌어들인 금액

        System.out.println(sb.append(result));

        br.close();
    }

    static void consult(int idx, int pay) {
        if (idx >= n) {
            result = Math.max(pay, result);
            return;
        }

        // 상담 끝마칠 수 있다면 -> 상담이 끝난 날짜와 상담비 넣음
        if (idx + schedule[idx][0] <= n) {
            consult(idx + schedule[idx][0], pay + schedule[idx][1]);
        } else { // 상담 끝마칠 수 없다면 -> 상담 끝난 날짜만 넘겨줌 (탈출 조건)
            consult(idx + schedule[idx][0], pay);
        }

        // 이어서 상담하지 않고 날짜 띄워서 새 날짜 입력
        consult(idx + 1, pay);
    }
}
