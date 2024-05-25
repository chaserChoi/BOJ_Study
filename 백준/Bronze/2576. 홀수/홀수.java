import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 != 0) {
                sum += num;
                if (num < min) min = num;
                hasOdd = true;
            }
        }

        if (!hasOdd) bw.write("-1\n");
        else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
