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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long p1 = Long.parseLong(st.nextToken());
        long q1 = Long.parseLong(st.nextToken());
        long p2 = Long.parseLong(st.nextToken());
        long q2 = Long.parseLong(st.nextToken());

        long numerator = p1 * p2; 
        long denominator = q1 * q2 * 2; 

        if (numerator % denominator == 0) bw.write("1\n");
        else bw.write("0\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
