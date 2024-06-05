import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String binaryString = br.readLine();

        BigInteger number = new BigInteger(binaryString, 2);

        BigInteger result = number.multiply(BigInteger.valueOf(17));

        bw.write(result.toString(2));

        bw.flush();
        bw.close();
        br.close();
    }
}
