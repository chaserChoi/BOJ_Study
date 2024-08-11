import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] firLine = br.readLine().split(" ");
        int n = Integer.parseInt(firLine[0]);
        int x = Integer.parseInt(firLine[1]);

        String[] secLine = br.readLine().split(" ");
        int[] t = new int[n];
        for (int i = 0; i < n; i++)
            t[i] = Integer.parseInt(secLine[i]);

        while (true) {
            for (int i = 0; i < n; i++) {
                if (x > t[i]) {
                    pw.println(i + 1);
                    pw.flush();
                    return;
                }
                x++;
            }
        }
    }
}
