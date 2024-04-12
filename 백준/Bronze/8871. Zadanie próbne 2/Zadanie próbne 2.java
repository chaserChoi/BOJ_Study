import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int minProblems = (n + 1) * 2;
        int maxProblems = (n + 1) * 3;
        
        bw.write(minProblems + " " + maxProblems);
        
        bw.flush();
        bw.close();
        br.close();
    }
}
