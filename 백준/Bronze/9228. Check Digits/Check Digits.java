import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("#"))
                break;

            int sum = 0;
            int l = input.length();
            for (int i = 0; i < l; i++)
                sum += (input.charAt(i) - '0') * (l - i + 1);
            int checksum = (11 - sum % 11) % 11;

            if (checksum == 10)
                sb.append(input).append(" -> Rejected\n");
            else
                sb.append(input).append(" -> ").append(checksum).append("\n");
        }

        System.out.print(sb);
    }
}
