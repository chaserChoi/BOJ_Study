import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken());
        long m1 = Long.parseLong(st.nextToken());
        long m2 = Long.parseLong(st.nextToken());

        int invalid = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long h = Long.parseLong(st.nextToken());
            long ki = Long.parseLong(st.nextToken());

            for (int j = 0; j < ki; j++) {
                long s = Long.parseLong(st.nextToken());

                if (s * m1 < h || s * m2 > h * k)
                    invalid++;
            }
        }

        pw.println(invalid);

        pw.flush();
        pw.close();
        br.close();
    }
}
