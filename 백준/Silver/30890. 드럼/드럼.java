import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0 && i % y == 0)
                sb.append(3);
            else if (i % x == 0)
                sb.append(2);
            else if (i % y == 0)
                sb.append(1);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
