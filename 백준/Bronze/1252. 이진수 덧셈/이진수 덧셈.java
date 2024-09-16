import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        String a = line[0];
        String b = line[1];

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        String ans = num1.add(num2).toString(2);

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
