import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int tensDigit = N / 10;
        int onesDigit = N % 10;
        
        if (tensDigit == onesDigit) bw.write("1");
        else bw.write("0");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
