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
        
        int horizontalCuts = N / 2;
        int verticalCuts = N - horizontalCuts;
        
        int maxPieces = (horizontalCuts + 1) * (verticalCuts + 1);
        
        bw.write(maxPieces + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
