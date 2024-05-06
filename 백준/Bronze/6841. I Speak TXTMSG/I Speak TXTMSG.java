import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            String output;
            switch (input) {
                case "CU":
                    output = "see you";
                    break;
                case ":-)":
                    output = "I’m happy";
                    break;
                case ":-(":
                    output = "I’m unhappy";
                    break;
                case ";-)":
                    output = "wink";
                    break;
                case ":-P":
                    output = "stick out my tongue";
                    break;
                case "(~.~)":
                    output = "sleepy";
                    break;
                case "TA":
                    output = "totally awesome";
                    break;
                case "CCC":
                    output = "Canadian Computing Competition";
                    break;
                case "CUZ":
                    output = "because";
                    break;
                case "TY":
                    output = "thank-you";
                    break;
                case "YW":
                    output = "you’re welcome";
                    break;
                case "TTYL":
                    output = "talk to you later";
                    break;
                default:
                    output = input;
            }

            bw.write(output);
            bw.newLine();
            if (input.equals("TTYL")) break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
