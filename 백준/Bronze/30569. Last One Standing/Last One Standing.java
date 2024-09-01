import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] p1Line = br.readLine().split(" ");
        String[] p2Line = br.readLine().split(" ");

        int h1 = Integer.parseInt(p1Line[0]);
        int d1 = Integer.parseInt(p1Line[1]);
        int t1 = Integer.parseInt(p1Line[2]);

        int h2 = Integer.parseInt(p2Line[0]);
        int d2 = Integer.parseInt(p2Line[1]);
        int t2 = Integer.parseInt(p2Line[2]);

        double time1 = 0;
        double time2 = 0;
        double t = 0;

        while (h1 > 0 && h2 > 0) {
            if (t >= time1) {
                time1 = t + t1;
                h2 -= d1;
            }
            if (t >= time2) {
                time2 = t + t2;
                h1 -= d2;
            }
            t += 0.5;
        }

        if (h1 > 0)
            pw.println("player one");
        else if (h2 > 0)
            pw.println("player two");
        else
            pw.println("draw");

        pw.flush();
        pw.close();
        br.close();
    }
}
