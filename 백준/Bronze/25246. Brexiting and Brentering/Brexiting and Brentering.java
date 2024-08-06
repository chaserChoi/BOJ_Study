import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine().trim();

        int lastVowelIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c))
                lastVowelIndex = i;
        }

        String result = s.substring(0, lastVowelIndex + 1) + "ntry";

        pw.println(result);

        pw.flush();
        pw.close();
        br.close();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
