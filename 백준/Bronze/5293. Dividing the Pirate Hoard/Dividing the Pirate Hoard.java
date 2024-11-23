import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int p = scanner.nextInt();

        for (int i = 0; i < p; i++) {
            int portion = c % p;

            c /= p;
            portion += c;
            c *= (p -1);

            System.out.print(portion + " ");
        }

        System.out.print("\n" + c + "\n");
    }
}

