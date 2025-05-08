import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());

            int max = 0;
            int curr = 0;

            for (int j = 0; j < m; j++) {
                String entry = st.nextToken();

                if (entry.equals("X"))
                    curr++;
                else {
                    if (curr > max)
                        max = curr;
                    curr = 0;
                }
            }

            if (curr > max)
                max = curr;

            bw.write("The longest contiguous subsequence of X's is of length " + max);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}