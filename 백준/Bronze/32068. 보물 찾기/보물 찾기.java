import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            int s = Integer.parseInt(line[2]);

            int step = 0;
            int curr = s;

            while (true) {
                step++;
                if (step % 2 == 1)
                    curr -= (step - 1);
                else
                    curr += (step - 1);

                if (curr == l || curr == r) {
                    pw.println(step);
                    break;
                }
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
