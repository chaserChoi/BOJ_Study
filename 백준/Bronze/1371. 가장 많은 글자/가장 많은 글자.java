import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String line;
        String s = "";

        while ((line = br.readLine()) != null)
            s += line;

        int max = 0;
        String sMax = "";

        for (char c = 'a'; c <= 'z'; c++) {
            int freq = s.length() - s.replace(String.valueOf(c), "").length();
            if (max == freq)
                sMax += String.valueOf(c);

            if (max < freq) {
                max = freq;
                sMax = String.valueOf(c);
            }
        }

        pw.println(sMax);

        pw.flush();
        pw.close();
        br.close();
    }
}
