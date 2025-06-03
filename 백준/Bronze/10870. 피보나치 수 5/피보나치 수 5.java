import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] fibonacci = new int[21];

        fibonacci[0] = 0;
        if (n > 0)
            fibonacci[1] = 1;

        for (int i = 2; i <= n; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        bw.write(String.valueOf(fibonacci[n]));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
