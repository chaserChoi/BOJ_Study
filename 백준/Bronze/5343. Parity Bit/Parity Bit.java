import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        while (lines-- > 0) {
            String data = br.readLine();
            int errors = 0;

            for (int i = 0; i < data.length(); i += 8) {
                String block = data.substring(i, i + 8);
                int ones = 0;

                for (int j = 0; j < 7; j++) {
                    if (block.charAt(j) == '1') ones++;
                }

                if ((ones % 2 == 0 && block.charAt(7) != '0') || (ones % 2 == 1 && block.charAt(7) != '1')) {
                    errors++;
                }
            }

            bw.write(Integer.toString(errors));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close(); 
    }
}
