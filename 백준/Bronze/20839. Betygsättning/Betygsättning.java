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
        
        double A = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        double E = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double studentA = Double.parseDouble(st.nextToken());
        double studentC = Double.parseDouble(st.nextToken());
        double studentE = Double.parseDouble(st.nextToken());

        if (studentA >= A && studentC >= C && studentE >= E) bw.write("A\n");
        else if (studentA >= A / 2 && studentC >= C && studentE >= E) bw.write("B\n");
        else if (studentC >= C && studentE >= E) bw.write("C\n");
        else if (studentC >= C / 2 && studentE >= E) bw.write("D\n");
        else bw.write("E\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
