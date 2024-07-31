import java.io.*;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        String start = line[0];
        int n = Integer.parseInt(line[1]);

        LocalDate startDate = LocalDate.parse(start);
        LocalDate anniversary = startDate.plusDays(n - 1);

        pw.println(anniversary.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
