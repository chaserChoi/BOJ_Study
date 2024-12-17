import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        while (++a <= 62) {
            long pow = 1L << a;
            int first = Long.toString(pow).charAt(0) - '0';
            if (first == b) {
                System.out.println(a);
                return;
            }
        }

        System.out.println(0);
    }
}
