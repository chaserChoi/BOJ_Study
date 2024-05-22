import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a--;
        b--;

        int rowA = a / 4;
        int colA = a % 4;
        int rowB = b / 4;
        int colB = b % 4;

        int distance = Math.abs(rowA - rowB) + Math.abs(colA - colB);

        bw.write(distance + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
