import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.equals("EOI")) {
            String lower = line.toLowerCase();

            if (lower.contains("nemo"))
                bw.write("Found");
            else
                bw.write("Missing");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}