import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            long m = Long.parseLong(br.readLine());
            if (m == 0)
                break;

            System.out.println("Y " + (m * m - m + 1));
        }
    }
}
