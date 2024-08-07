import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            double a = Double.parseDouble(line[0]);
            double b = Double.parseDouble(line[1]);
            double c = b / (a / 100) / (a / 100);

            if (a < 140.1) pw.println(6);
            else if (a < 146) pw.println(5);
            else if (a < 159 || a >= 204) pw.println(4);
            else if (a < 161) pw.println(16 <= c && c < 35 ? 3 : 4);
            else if (c < 16 || c >= 35) pw.println(4);
            else if (c < 18.5 || c >= 30) pw.println(3);
            else if (c < 20 || c >= 25) pw.println(2);
            else pw.println(1);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
