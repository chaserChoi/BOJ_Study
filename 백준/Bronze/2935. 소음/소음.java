import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String operator = br.readLine();
        String B = br.readLine();

        if (operator.equals("*")) {
            bw.write("1");
            for (int i = 0; i < A.length() + B.length() - 2; i++) bw.write("0");
        } else {
            if (A.length() == B.length()) {
                bw.write("2");
                for (int i = 1; i < A.length(); i++) bw.write("0");
            } else {
                String longer = A.length() > B.length() ? A : B;
                String shorter = A.length() > B.length() ? B : A;
                bw.write("1");
                for (int i = 1; i < longer.length() - shorter.length(); i++) bw.write("0");
                bw.write("1");
                for (int i = 1; i < shorter.length(); i++) bw.write("0");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
