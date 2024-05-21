import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String vowels = "aeiouAEIOU";

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;

            int vowelCount = 0;
            for (int i = 0; i < line.length(); i++) {
                if (vowels.indexOf(line.charAt(i)) != -1) vowelCount++;
            }
            bw.write(vowelCount + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
