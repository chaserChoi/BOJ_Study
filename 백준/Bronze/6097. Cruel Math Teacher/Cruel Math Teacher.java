import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger n =new BigInteger(input[0]);
        int p= Integer.parseInt(input[1]);

        BigInteger ans = n.pow(p);

        String ansStr = ans.toString();
        
        for (int i = 0; i < ansStr.length(); i += 70)
            System.out.println(ansStr.substring(i, Math.min(i + 70, ansStr.length())));
    }
}
