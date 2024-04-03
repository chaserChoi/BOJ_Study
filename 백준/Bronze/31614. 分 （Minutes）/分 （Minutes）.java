import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(H*60+M));
        bw.flush();
        bw.close();
    }
}