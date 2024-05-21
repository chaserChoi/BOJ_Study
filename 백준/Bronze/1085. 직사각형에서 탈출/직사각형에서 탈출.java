import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int dist1 = x;
        int dist2 = y;
        int dist3 = w - x;
        int dist4 = h - y;

        int minDist = Math.min(Math.min(dist1, dist2), Math.min(dist3, dist4));

        bw.write(minDist + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
