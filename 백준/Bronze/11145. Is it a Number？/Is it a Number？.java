import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine().trim();

            if (line.matches("\\d+")) {
                String cleaned = line.replaceFirst("^0+(?!$)", "");
                bw.write(cleaned + "\n");
            } else
                bw.write("invalid input\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
