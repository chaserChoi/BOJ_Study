import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int max = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int m = Integer.parseInt(line[2]);

        int cur = max;
        int used = 0;

        for (int i = 0; i < n + m; i++) {
            int cmd = Integer.parseInt(br.readLine());

            if (cmd == 1) {
                if (used == cur)
                    cur *= 2;
                used++;
            } else if (cmd == 0)
                used--;
        }

        pw.println(cur);

        pw.flush();
        pw.close();
        br.close();
    }
}
