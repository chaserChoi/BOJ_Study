import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!(input = br.readLine()).equals("0")) {
            int width = 1;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '1') width += 2;
                else if (c == '0') width += 4;
                else width += 3;

                if (i < input.length() - 1) width += 1;
            }

            width += 1;

            bw.write(width + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
