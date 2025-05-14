import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        LocalDate start = LocalDate.of(2014, 4, 2);
        LocalDate anniversary = start.plusDays(n - 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted = anniversary.format(formatter);

        bw.write(formatted);
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}