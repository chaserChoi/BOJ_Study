import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                sb.append(divisor).append("\n");
                n /= divisor;
            } else
                divisor++;
        }

        System.out.print(sb);

        br.close();
    }
}
