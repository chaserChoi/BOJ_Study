import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] figures = new int[n];
        for (int i = 0; i < n; i++)
            figures[i] = Integer.parseInt(input[i]);

        for (int i = 0; i < n - 2; i++) {
            int a = figures[i];
            int b = figures[i+1];
            int c = figures[i+2];

            if (a != b && b != c && a != c) {
                System.out.println("TAK");
                return;
            }
        }
        System.out.println("NIE");
    }
}
