import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            String lower = line.toLowerCase();

            if (lower.contains("problem"))
                bw.write("yes");
            else
                bw.write("no");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}