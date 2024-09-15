import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && line.charAt(j) == 'F')
                    cnt++;
            }
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
