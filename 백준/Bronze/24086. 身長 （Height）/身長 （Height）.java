import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine()); 
        
        int heightIncrease = B - A;

        bw.write(String.valueOf(heightIncrease));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
