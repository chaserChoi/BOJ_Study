import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(br.readLine());

        int knownSum = 0;

        for (int i = 0; i < 9; i++) knownSum += Integer.parseInt(br.readLine());

        int unknownPrice = totalPrice - knownSum;

        bw.write(String.valueOf(unknownPrice));
        bw.newLine();

        br.close();
        bw.close();
    }
}
