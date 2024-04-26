import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int num, alp;
        num = n / 8;
        alp = n % 8;

        if (alp == 0) {
            alp = 8;
            num -= 1;
        }

        bw.write((char) (alp + 96) + String.valueOf(num + 1));

        bw.flush();
        br.close();
        bw.close();
    }
}
