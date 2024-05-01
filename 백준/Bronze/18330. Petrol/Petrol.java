import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int totalQuota = k + 60;

        int cost;
        if (n > totalQuota) cost = totalQuota * 1500 + (n - totalQuota) * 3000;
        else cost = n * 1500;

        bw.write(String.valueOf(cost));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
