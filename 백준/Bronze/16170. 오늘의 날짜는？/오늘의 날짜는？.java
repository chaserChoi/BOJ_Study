import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));

        bw.write(utc.format(DateTimeFormatter.ofPattern("yyyy")));
        bw.newLine();
        bw.write(utc.format(DateTimeFormatter.ofPattern("MM")));
        bw.newLine();
        bw.write(utc.format(DateTimeFormatter.ofPattern("dd")));

        bw.flush();
        bw.close();
    }
}
