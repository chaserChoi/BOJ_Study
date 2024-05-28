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

        String order = br.readLine();

        for(int i = 0; i < 3; i++) {
            if(order.charAt(i) == 'A') bw.write(numbers[0] + " ");
            else if(order.charAt(i) == 'B') bw.write(numbers[1] + " ");
            else if(order.charAt(i) == 'C') bw.write(numbers[2] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
