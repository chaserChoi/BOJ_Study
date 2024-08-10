import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int s = Integer.parseInt(line[0]);
        int e = Integer.parseInt(line[1]);
        int d = Integer.parseInt(line[2]);

        int ans = 0;

        for (int i = s; i <= e; i++) {
            int n = i;
            while (n > 0) {
                if (n % 10 == d)
                    ans++;
                n /= 10;
            }
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
