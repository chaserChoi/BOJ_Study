import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        boolean extreme = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] < 0) {
                    extreme = false;
                    break;
                }
            }
            if (!extreme)
                break;
        }

        if (extreme)
            bw.write("yes");
        else
            bw.write("no");
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}