import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        float N = Float.parseFloat(br.readLine());
        float[][] points = new float[3][2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            points[i][0] = Float.parseFloat(st.nextToken());
            points[i][1] = Float.parseFloat(st.nextToken());
            if (points[i][0] > points[i][1]) {
                float temp = points[i][0];
                points[i][0] = points[i][1];
                points[i][1] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (points[i][0] == points[i][1])
                continue;

            float mid = (points[i][0] + points[i][1]) / 2;

            if (mid < N - mid) {
                for (int j = i + 1; j < 3; j++) {
                    if (points[j][0] < mid) points[j][0] = mid - points[j][0];
                    else points[j][0] -= mid;

                    if (points[j][1] < mid) points[j][1] = mid - points[j][1];
                    else points[j][1] -= mid;

                    if (points[j][0] > points[j][1]) {
                        float temp = points[j][0];
                        points[j][0] = points[j][1];
                        points[j][1] = temp;
                    }
                }

                N = N - mid;
            } else {
                for (int j = i + 1; j < 3; j++) {
                    if (mid < points[j][0]) points[j][0] = mid - (points[j][0] - mid);
                    if (mid < points[j][1]) points[j][1] = mid - (points[j][1] - mid);

                    if (points[j][0] > points[j][1]) {
                        float temp = points[j][0];
                        points[j][0] = points[j][1];
                        points[j][1] = temp;
                    }
                }

                N = mid;
            }
        }

        pw.printf("%.1f\n", N);

        pw.flush();
        pw.close();
        br.close();
    }
}
