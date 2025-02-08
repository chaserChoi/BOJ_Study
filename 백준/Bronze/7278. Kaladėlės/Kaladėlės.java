import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] heights = br.readLine().split(" ");
        int a = Integer.parseInt(heights[0]);
        int b = Integer.parseInt(heights[1]);
        int c = Integer.parseInt(heights[2]);

        int d1 = Math.min(n % a, a - n % a);
        int d2 = Math.min(n % b, b - n % b);
        int d3 = Math.min(n % c, c - n % c);

        if (d1 <= d2 && d1 <= d3) {
            System.out.print(a + " ");
            if ((n - d1) % a == 0)
                System.out.println(n - d1);
            else
                System.out.println(n + d1);
        } else if (d1 >= d2 && d2 <= d3) {
            System.out.print(b + " ");
            if ((n - d2) % b == 0)
                System.out.println(n - d2);
            else
                System.out.println(n + d2);
        } else {
            System.out.print(c + " ");
            if ((n - d3) % c == 0)
                System.out.println(n - d3);
            else
                System.out.println(n + d3);
        }
    }
}
