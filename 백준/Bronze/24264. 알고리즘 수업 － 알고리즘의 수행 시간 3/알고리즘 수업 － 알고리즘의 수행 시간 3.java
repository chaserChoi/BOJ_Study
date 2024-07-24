import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long cnt = (long) n * n;

        bw.write(cnt + "\n");
        bw.write("2");

        bw.flush();
        bw.close();
        br.close();
    }
}
