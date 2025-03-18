import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final long MOD = 500000009;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long wynik = 1;
        long potega = 1;

        for (int i = 2; i <= n; i++) {
            potega = (potega << 1) % MOD;
            potega = (potega << 1) % MOD;
            wynik = (wynik + potega) % MOD;
        }

        System.out.println(wynik);
    }
}
