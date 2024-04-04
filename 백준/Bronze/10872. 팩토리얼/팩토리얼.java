import java.io.*;

public class Main {
    static int factorial(int n) {
        int init = 1;
        for (int i = n; i > 0; i--) init *= i;
        return init;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(factorial(N)));
        bw.flush();
        bw.close();
    }
}