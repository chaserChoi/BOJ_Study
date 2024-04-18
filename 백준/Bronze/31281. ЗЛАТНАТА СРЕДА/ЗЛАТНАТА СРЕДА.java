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
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long middle;

        if ((a >= b && a <= c) || (a <= b && a >= c)) middle = a;
        else if ((b >= a && b <= c) || (b <= a && b >= c)) middle = b;
        else middle = c;

        bw.write(Long.toString(middle));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
