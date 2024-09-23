import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            while (n >= 10) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }

            pw.println(n);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
