import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String correctedName = line.replace('i', 'x').replace('e', 'i').replace('x', 'e')
                    .replace('I', 'X').replace('E', 'I').replace('X', 'E');
            bw.write(correctedName);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
