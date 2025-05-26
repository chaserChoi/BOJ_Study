import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int digit = 0;
            int space = 0;

            for (char c : line.toCharArray()) {
              if (Character.isLowerCase(c))
                  lower++;
              else if (Character.isUpperCase(c))
                  upper++;
              else if (Character.isDigit(c))
                  digit++;
              else if (Character.isSpaceChar(c))
                  space++;
            }

            bw.write(lower + " " + upper + " " + digit + " " + space);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
