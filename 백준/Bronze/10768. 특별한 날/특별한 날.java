import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (month < 2 || (month == 2 && day < 18)) bw.write("Before");
        else if (month > 2 || (month == 2 && day > 18)) bw.write("After");
        else bw.write("Special");

        bw.flush();
        br.close();
        bw.close();
    }
}
