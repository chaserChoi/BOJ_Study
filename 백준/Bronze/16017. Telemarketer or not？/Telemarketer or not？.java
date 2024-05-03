import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstDigit = Integer.parseInt(br.readLine());
        int secondDigit = Integer.parseInt(br.readLine());
        int thirdDigit = Integer.parseInt(br.readLine());
        int lastDigit = Integer.parseInt(br.readLine());

        if ((firstDigit == 8 || firstDigit == 9) &&
                (lastDigit == 8 || lastDigit == 9) &&
                (secondDigit == thirdDigit)) {
            bw.write("ignore\n");
        } else bw.write("answer\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
