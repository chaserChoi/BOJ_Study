import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        while (true) {
            b += a;
            if (b >= 5) {
                pw.println("yt");
                break;
            }

            a += b;
            if (a >= 5) {
                pw.println("yj");
                break;
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
