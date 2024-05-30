import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        String s;

        while ((s = br.readLine()) != null) ans++;

        System.out.println(ans);

        br.close();
    }
}
