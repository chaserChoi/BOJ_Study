import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            double total = 0;

            for (int j = 0; j < x; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                int quantity = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                total += quantity * price;
            }

            bw.write(String.format("$%.2f\n", total)); 
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
