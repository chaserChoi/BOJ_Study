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

        int countV = n / 5;
        int countI = n % 5;

        for (int i = 0; i < countV; i++) bw.write("V");

        for (int i = 0; i < countI; i++) bw.write("I");

        bw.flush();
        bw.close();
        br.close();
    }
}
