import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate contestDate = LocalDate.parse(br.readLine(), formatter);

        LocalDate regionalDate = LocalDate.of(2023, 10, 21);

        if (contestDate.plusDays(35).isBefore(regionalDate) || contestDate.plusDays(35).isEqual(regionalDate)) {
            bw.write("GOOD");
        } else bw.write("TOO LATE");

        bw.flush();
        bw.close();
        br.close();
    }
}
