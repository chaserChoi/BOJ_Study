import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine().trim();
        String p = br.readLine().trim();

        bw.write(p);

        bw.flush();
        bw.close();
        br.close();
    }
}
