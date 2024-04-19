import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        for (int i = 0; i < 10; i++) {
            if (sum - numbers[i] == numbers[i]) {
                bw.write(String.valueOf(numbers[i]));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
