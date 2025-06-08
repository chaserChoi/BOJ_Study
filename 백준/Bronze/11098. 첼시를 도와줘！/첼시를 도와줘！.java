import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine());

            String player = "";
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < p; j++) {
                st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if (price > max) {
                    max = price;
                    player = name;
                }
            }

            bw.write(player);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}