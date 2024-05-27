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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int balance = Integer.parseInt(st.nextToken());
            String transactionType = st.nextToken();
            int amount = Integer.parseInt(st.nextToken());

            if (balance == 0 && "W".equals(transactionType) && amount == 0) break;

            if ("W".equals(transactionType)) {
                if (balance - amount < -200) bw.write("Not allowed\n");
                else {
                    balance -= amount;
                    bw.write(balance + "\n");
                }
            } else if ("D".equals(transactionType)) {
                balance += amount;
                bw.write(balance + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
