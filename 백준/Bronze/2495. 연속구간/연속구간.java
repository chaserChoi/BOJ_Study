import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        for (int i = 0; i < 3; i++) {
            String num = br.readLine();
            int max = 1;
            int curr = 1;

            for (int j = 1; j < num.length(); j++) {
                if (num.charAt(j) == num.charAt(j - 1))
                    curr++;
                else {
                    max = Math.max(max, curr);
                    curr = 1;
                }
            }

            max = Math.max(max, curr);

            if (max == 1)
                pw.println(1);
            else
                pw.println(max);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
