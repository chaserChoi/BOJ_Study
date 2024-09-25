import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int m = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = m; i <= n; i++)
            if (isPrime(i))
                primes.add(i);

        if (primes.isEmpty())
            pw.println(-1);
        else {
            int sum = 0;
            int min = primes.get(0);

            for (int p : primes) {
                sum += p;
                if (p < min)
                    min = p;
            }

            pw.println(sum);
            pw.println(min);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;

        return true;
    }
}
