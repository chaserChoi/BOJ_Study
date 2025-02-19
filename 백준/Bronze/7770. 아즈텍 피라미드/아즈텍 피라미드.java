import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int curr = 0;
        int ans = 0;

        while (curr <= n) {
            curr += (ans + 1) * (ans + 1) + ans * ans;
            ans++;
        }

        System.out.println(ans - 1);
    }
}
