import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        boolean containsSeven = String.valueOf(number).contains("7");
        boolean divisibleBySeven = number % 7 == 0;

        int result;
        if (containsSeven && divisibleBySeven) result = 3;
         else if (containsSeven) result = 2;
         else if (divisibleBySeven) result = 1;
         else result = 0;


        bw.write(String.valueOf(result));

        bw.flush();
        br.close();
        bw.close();
    }
}
