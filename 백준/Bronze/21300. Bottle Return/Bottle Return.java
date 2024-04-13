import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리를 위한 StringTokenizer
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 주어진 6개의 정수를 읽고 각각의 컨테이너 수를 변수에 저장
        int beer = Integer.parseInt(st.nextToken());
        int malt = Integer.parseInt(st.nextToken());
        int wine = Integer.parseInt(st.nextToken());
        int soda = Integer.parseInt(st.nextToken());
        int seltzer = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());

        // 뉴욕 주에서는 모든 컨테이너에 대해 5센트의 환불 금액이 있음
        int totalRefund = 5 * (beer + malt + wine + soda + seltzer + water);

        // 총 환불 금액을 출력
        bw.write(String.valueOf(totalRefund));

        // 출력 버퍼 비우기 및 자원 해제
        bw.flush();
        bw.close();
        br.close();
    }
}
