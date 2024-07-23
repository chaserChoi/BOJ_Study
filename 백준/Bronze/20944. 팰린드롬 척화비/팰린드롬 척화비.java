import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < n / 2)
                ans.append('a');
            else if (n % 2 == 1 && i == n / 2)
                ans.append('s');
            else
                ans.append('a');
        }

        pw.println(ans.toString());

        br.close();
        pw.flush();
        pw.close();
    }
}
