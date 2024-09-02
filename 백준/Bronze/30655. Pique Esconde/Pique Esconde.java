import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            if (n == 0 && m == 0)
                break;

            HashMap<Integer, Boolean> map = new HashMap<>();
            map.put(m, true);

            for (int i = 0; i < n - 2; i++) {
                int x = Integer.parseInt(br.readLine());
                map.put(x, true);
            }

            for (int i = 1; i <= n; i++) {
                if (!map.containsKey(i)) {
                    pw.println(i);
                    break;
                }
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
