import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] firLine = br.readLine().split(" ");
        int m = Integer.parseInt(firLine[0]);
        int k = Integer.parseInt(firLine[1]);

        long total = 0;
        String[] secLine = br.readLine().split(" ");
        for (int i = 0; i < k; i++)
            total += Long.parseLong(secLine[i]);

        long max = (total + m - 1) / m;

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}
