import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) numbers[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(numbers);

        bw.write(String.valueOf(numbers[1]));

        bw.flush();
        bw.close();
        br.close();
    }
}
