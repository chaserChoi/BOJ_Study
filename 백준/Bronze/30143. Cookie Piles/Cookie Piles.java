import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int a = Integer.parseInt(line[1]);
            int d = Integer.parseInt(line[2]);

            int total = 0;
            for (int j = 0; j < n; j++)
                total += a + j * d;

            sb.append(total).append("\n");
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
