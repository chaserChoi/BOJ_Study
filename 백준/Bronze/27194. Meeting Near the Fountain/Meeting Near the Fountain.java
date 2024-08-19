import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long t = Integer.parseInt(st.nextToken());

        long m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());

        double distToPark = m;
        double distInPark = n - m;

        double timeCity = distToPark / x;
        double timePark = distInPark / y;
        double total = timeCity + timePark;

        double wait = Math.ceil((total - 60 * t) / 60);

        if (wait <= 0)
            pw.println(0);
        else
            pw.println((int)wait);

        pw.flush();
        pw.close();
        br.close();
    }
}
