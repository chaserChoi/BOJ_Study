import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] diff = br.readLine().split(" ");
        int a = Integer.parseInt(diff[0]);
        int b = Integer.parseInt(diff[1]);
        int c = Integer.parseInt(diff[2]);

        int n = Integer.parseInt(br.readLine());

        int max = 0;

        for (int i = 0; i < n; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                String[] skill = br.readLine().split(" ");
                int cntA = Integer.parseInt(skill[0]);
                int cntB = Integer.parseInt(skill[1]);
                int cntC = Integer.parseInt(skill[2]);

                total += a * cntA + b * cntB + c * cntC;
            }

            max = Math.max(max, total);
        }

        bw.write(String.valueOf(max) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
