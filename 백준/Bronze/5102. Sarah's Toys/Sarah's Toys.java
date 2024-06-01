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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalToys = Integer.parseInt(st.nextToken());
            int toysOutside = Integer.parseInt(st.nextToken());

            if (totalToys == 0 && toysOutside == 0) break;

            int toysInRoom = totalToys - toysOutside;
            int pairs;
            int groupOfThree = 0;

            if (toysInRoom % 2 == 0) pairs = toysInRoom / 2;
            else {
                pairs = (toysInRoom - 3) / 2;
                if (pairs >= 0) groupOfThree = 1;
                else pairs = 0;
            }

            bw.write(pairs + " " + groupOfThree + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
