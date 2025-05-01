import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.equals("ENDOFINPUT")) {
            if (line.equals("START")) {
                String cipher = br.readLine();
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < cipher.length(); i++) {
                    char curr = cipher.charAt(i);

                    if (curr >= 'A' && curr <= 'Z') {
                        int decrypted = (curr - 'A' - 5 + 26) % 26 + 'A';
                        sb.append((char) decrypted);
                    } else
                        sb.append(curr);
                }

                bw.write(sb.toString());
                bw.newLine();

                br.readLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}