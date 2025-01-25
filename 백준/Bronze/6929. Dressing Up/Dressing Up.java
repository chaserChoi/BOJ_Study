import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());

        for (int i = 1; i <= h; i += 2) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            for (int j = i; j < 2 * h - i; j++)
                System.out.print(" ");
            for (int j = 2 * h - i; j < 2 * h; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = h - 2; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            for (int j = i; j < 2 * h - i; j++)
                System.out.print(" ");
            for (int j = 2 * h - i; j < 2 * h; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

