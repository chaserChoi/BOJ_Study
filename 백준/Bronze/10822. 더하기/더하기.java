import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] numbers = str.split(",");
        long sum = 0;

        for (String number : numbers) {
            int n = Integer.parseInt(number);
            sum += n;
        }

        bw.write(String.valueOf(sum));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
