import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int start = 1, end = 1;

        while (true) {
            if (n == 1) {
                bw.write("1\n");
                break;
            }

            start = end + 1;
            end = start + (6 * count) - 1;
            count++;
            if (n >= start && n <= end) {
                bw.write(count + "\n");
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
