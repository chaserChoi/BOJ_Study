import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] start = br.readLine().split(" ");
        int t1 = Integer.parseInt(start[0]);
        int t2 = Integer.parseInt(start[1]);

        int t3 = Integer.parseInt(br.readLine());

        String[] travelTime = br.readLine().split(" ");
        int t4 = Integer.parseInt(travelTime[0]);
        int t5 = Integer.parseInt(travelTime[1]);

        int b = Integer.parseInt(br.readLine());
        int t6 = Integer.parseInt(br.readLine());

        int ans = (t1 - t4) * 60 + t2 - 10 - t3 - t5 - (b + 1) * t6;

        pw.println((ans / 60 < 10 ? "0" : "") + ans / 60 + " " + (ans % 60 < 10 ? "0" : "") + ans % 60);

        pw.flush();
        pw.close();
        br.close();
    }
}
