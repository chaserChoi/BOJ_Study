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

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long C = Long.parseLong(br.readLine());

        long totalBalance = A + B;
        long totalChickenPrice = 2 * C;

        if (totalBalance >= totalChickenPrice) totalBalance -= totalChickenPrice;

        bw.write(String.valueOf(totalBalance));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
