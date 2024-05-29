import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num1 = st.nextToken();
            String num2 = st.nextToken();

            if (num1.equals("0") && num2.equals("0")) break;

            int carry = 0;
            int carryCount = 0;

            while (num1.length() < num2.length()) num1 = "0" + num1;
            while (num2.length() < num1.length()) num2 = "0" + num2;

            for (int i = num1.length() - 1; i >= 0; i--) {
                int sum = (num1.charAt(i) - '0') + (num2.charAt(i) - '0') + carryCount;
                if (sum >= 10) {
                    carry++;
                    carryCount = 1;
                } else carryCount = 0;
            }

            bw.write(carry + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
