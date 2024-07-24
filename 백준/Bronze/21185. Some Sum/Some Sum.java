import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 1)
            System.out.println("Either");
        else {
            if (((n * (n + 1) / 2) % 2) == 1)
                System.out.println("Odd");
            else
                System.out.println("Even");
        }
    }
}
