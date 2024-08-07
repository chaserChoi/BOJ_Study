import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int diagonal = 1;
        int cnt = 2;

        while (diagonal < n) diagonal += cnt++;

        pw.println((diagonal - n + 1) + " " + (cnt - diagonal + n - 1));

        pw.flush();
        pw.close();
        br.close();
    }
}
