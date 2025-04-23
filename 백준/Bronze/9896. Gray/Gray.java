import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String bin = br.readLine();
        StringBuilder sb = new StringBuilder();

        sb.append(bin.charAt(0));

        for (int i = 1; i < n; i++) {
            char prev = bin.charAt(i - 1);
            char curr = bin.charAt(i);

            if (prev == curr)
                sb.append('0');
            else
                sb.append('1');
        }

        System.out.println(sb.toString());
    }
}