import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long k = Long.parseLong(input[2]);

        long total = (a / k) * (b / k) - Math.max(a / k - 2, 0) * Math.max(b / k - 2, 0);

        System.out.println(total);
    }
}
