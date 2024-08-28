import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int ans = 1;

        for (int i = 0; i < 4; i++) {
            ans *= (n - i);
            ans /= (i + 1);
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
