import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        
        BigInteger A = new BigInteger(input[0]);
        BigInteger B = new BigInteger(input[1]);
        BigInteger sum = A.add(B);

        bw.write(sum.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
