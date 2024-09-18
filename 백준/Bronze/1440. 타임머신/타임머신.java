import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String time = br.readLine();

        StringTokenizer st = new StringTokenizer(time, ":");

        int[] parts = new int[3];

        parts[0] = Integer.parseInt(st.nextToken());
        parts[1] = Integer.parseInt(st.nextToken());
        parts[2] = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int h = 0; h < 3; h++){
            for(int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    if(h != m && m != s && s != h)
                        if(parts[h] >= 1 && parts[h] <= 12 && parts[m] >= 0 && parts[m] <= 59 && parts[s] >= 0 && parts[s] <= 59)
                            cnt++;
                }
            }
        }

        sb.append(cnt);

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
