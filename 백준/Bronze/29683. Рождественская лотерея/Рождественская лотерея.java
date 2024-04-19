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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int totalTickets = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int purchase = Integer.parseInt(st.nextToken());
            totalTickets += purchase / A;
        }

        bw.write(String.valueOf(totalTickets));

        bw.flush();
        br.close();
        bw.close();
    }
}
