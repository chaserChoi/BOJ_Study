import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());

        // 1. 대각선 찾기
        int n = 1;
        int sum = 1;
        while (sum < x) {
            n++;
            sum += n;
        }

        // 2. 해당 대각선 내에서 몇 번째 분수인지 계산
        int prevSum = sum - n;
        int offset = x - prevSum;

        // 3. 대각선 번호 n 홀짝 여부
        int head, tail;
        if (n % 2 == 1) {
            head = n - offset + 1;
            tail = offset;
        } else {
            head = offset;
            tail = n - offset + 1;
        }

        // 4. 출력
        sb.append(head).append("/").append(tail);
        System.out.println(sb);

        br.close();
    }
}
