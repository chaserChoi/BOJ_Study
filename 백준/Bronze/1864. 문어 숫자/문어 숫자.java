import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] octSymbols = {
                "-",
                "\\",
                "(",
                "@",
                "?",
                ">",
                "&",
                "%",
                "/"
        };

        int[] vals = {0, 1, 2, 3, 4, 5, 6, 7, -1};

        String input;
        while (!(input = br.readLine()).equals("#")) {
            int decValue = 0;
            int l = input.length();

            for (int i = 0; i < l; i++) {
                char sym = input.charAt(l - 1 - i);
                int val = -1;

                for (int j = 0; j < octSymbols.length; j++) {
                    if (sym == octSymbols[j].charAt(0)) {
                        val = vals[j];
                        break;
                    }
                }

                decValue += val * Math.pow(8, i);
            }

            pw.println(decValue);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
