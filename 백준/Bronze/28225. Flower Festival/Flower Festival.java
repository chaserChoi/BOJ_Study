import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int car = -1;
        double min = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            int xi = Integer.parseInt(line[0]);
            int vi = Integer.parseInt(line[1]);

            double time = (f - xi) / (double) vi;

            if (time < min) {
                min = time;
                car = i;
            }
        }

        pw.println(car);

        pw.flush();
        pw.close();
        br.close();
    }
}
