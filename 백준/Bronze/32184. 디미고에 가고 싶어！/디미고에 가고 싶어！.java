import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        pw.println(1 + (b - a + (a % 2 == 0 ? 1 : 0) - (b % 2 == 0 ? 1 : 0)) / 2);

        pw.flush();
        pw.close();
        br.close();
    }
}
