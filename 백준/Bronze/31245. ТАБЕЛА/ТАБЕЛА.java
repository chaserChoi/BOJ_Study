import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] prices = br.readLine().split(" ");
        int cena1 = Integer.parseInt(prices[0]);
        int cena2 = Integer.parseInt(prices[1]);
        int cena3 = Integer.parseInt(prices[2]);

        StringBuilder sb = new StringBuilder();

        sb.append(cena1 / 10);

        if (cena1 % 10 == cena2 / 10) {
            sb.append(cena1 % 10);
            sb.append("'");
        } else {
            sb.append(cena1 % 10);
            sb.append(cena2 / 10);
        }

        if (cena2 % 10 == cena3 / 10) {
            sb.append(cena2 % 10);
            sb.append("'");
        } else {
            sb.append(cena2 % 10);
            sb.append(cena3 / 10);
        }

        sb.append(cena3 % 10);

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
