import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j * i <= n; j++)
                cnt++;
        }

        System.out.println(cnt);
    }
}
