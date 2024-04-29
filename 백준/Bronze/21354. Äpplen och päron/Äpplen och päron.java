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
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int AxelIncome = A * 7;
        int PetraIncome = P * 13;

        if (AxelIncome > PetraIncome) bw.write("Axel");
        else if (AxelIncome < PetraIncome) bw.write("Petra");
        else bw.write("lika");

        bw.flush();
        br.close();
        bw.close();
    }
}
