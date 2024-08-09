import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);

        int ans = 0;

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());

            ans += (x < r ? 1 : x > r ? -1 : 0);
        }

        pw.println(ans > 0 ? 1 : ans < 0 ? 2 : 0);

        pw.flush();
        pw.close();
        br.close();
    }
}
