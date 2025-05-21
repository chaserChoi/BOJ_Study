import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] sizeArr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            cnt += sizeArr[i] / t;
            cnt = sizeArr[i] % t > 0 ? cnt + 1 : cnt;
        }
        bw.write(cnt + "\n");
        bw.write(n / p + " " + n % p);

        bw.flush();
        br.close();
        bw.close();
    }
}
