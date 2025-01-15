import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int nikky = 0, byron = 0;
        int p = a, q = c;

        while (s-- > 0) {
            if (p > 0) {
                nikky++;
                p--;
                if (p == 0)
                    p -= b;
            } else {
                nikky--;
                p++;
                if (p == 0)
                    p = a;
            }

            if (q > 0) {
                byron++;
                q--;
                if (q == 0)
                    q = -d;
            } else {
                byron--;
                q++;
                if (q == 0)
                    q = c;
            }
        }

        if (nikky > byron)
            System.out.println("Nikky");
        else if (nikky < byron)
            System.out.println("Byron");
        else
            System.out.println("Tied");
    }
}

