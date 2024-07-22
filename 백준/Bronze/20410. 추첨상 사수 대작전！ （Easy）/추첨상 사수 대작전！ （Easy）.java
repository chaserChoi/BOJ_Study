import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int m = Integer.parseInt(line[0]);
        int seed = Integer.parseInt(line[1]);
        int x1 = Integer.parseInt(line[2]);
        int x2 = Integer.parseInt(line[3]);

        int a = -1, c = -1;

        for (int i = 0; i < m; i++) {
            int candiC = (x1 - (i * seed) % m + m) % m;
            int calcX2 = (i * x1 + candiC) % m;
            if (calcX2 == x2) {
                a = i;
                c = candiC;
                break;
            }
        }

        pw.println(a + " " + c);

        br.close();
        pw.flush();
        pw.close();
    }
}
