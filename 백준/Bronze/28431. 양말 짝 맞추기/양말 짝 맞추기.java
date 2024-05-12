import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] counts = new int[10];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] % 2 != 0) {
                bw.write(Integer.toString(i));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
