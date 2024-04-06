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

        String line;
        BigInteger fortyTwo = new BigInteger("42");

        while (!(line = br.readLine()).equals("0")) {
            BigInteger ticketNumber = new BigInteger(line);
            if (ticketNumber.mod(fortyTwo).equals(BigInteger.ZERO)) bw.write("PREMIADO\n");
            else bw.write("TENTE NOVAMENTE\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
