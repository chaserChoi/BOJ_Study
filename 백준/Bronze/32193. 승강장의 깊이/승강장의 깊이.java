import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int surface = 0;
        int platform = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            surface += a;
            platform += b;

            int d = surface - platform;
            sb.append(d).append("\n");
        }

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
