import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            switch (c) {
                case 'a':
                    output.append('4');
                    break;
                case 'e':
                    output.append('3');
                    break;
                case 'i':
                    output.append('1');
                    break;
                case 'o':
                    output.append('0');
                    break;
                case 's':
                    output.append('5');
                    break;
                default:
                    output.append(c);
            }
        }

        bw.write(output.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
