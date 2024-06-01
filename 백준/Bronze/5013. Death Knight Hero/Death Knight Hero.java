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
        int winCount = 0;

        for(int i = 0; i < n; i++) {
            String abilities = br.readLine();
            if(!abilities.contains("CD")) winCount++;
        }

        bw.write(String.valueOf(winCount));
        bw.flush();
        bw.close(); 
        br.close();
    }
}
