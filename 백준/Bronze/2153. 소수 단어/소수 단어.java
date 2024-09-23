import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String word = br.readLine();
        int sum = 0;

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c))
                sum += c - 'a' + 1;
            else if (Character.isUpperCase(c))
                sum += c - 'A' + 27;
        }

        if (isPrime(sum))
            pw.println("It is a prime word.");
        else
            pw.println("It is not a prime word.");

        pw.flush();
        pw.close();
        br.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return true;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;

        return true;
    }
}
