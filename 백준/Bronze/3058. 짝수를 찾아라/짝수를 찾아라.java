import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int sum = 0;
            int min = 100;

            for(int j = 0; j < 7; j++) {
                int num = Integer.parseInt(st.nextToken());

                if(num % 2 == 0) {
                    sum += num;
                    if(num < min) min = num;
                }
            }

            bw.write(sum + " " + min + "\n");
        }

        br.close();
        bw.flush(); 
        bw.close();
    }
}
