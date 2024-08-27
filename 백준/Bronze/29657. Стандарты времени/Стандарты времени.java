import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        String[] time = br.readLine().split(" ");

        int a1 = Integer.parseInt(first[0]);
        int b1 = Integer.parseInt(first[1]);
        int c1 = Integer.parseInt(first[2]);

        int a2 = Integer.parseInt(second[0]);
        int b2 = Integer.parseInt(second[1]);
        int c2 = Integer.parseInt(second[2]);

        int h1 = Integer.parseInt(time[0]);
        int m1 = Integer.parseInt(time[1]);
        int s1 = Integer.parseInt(time[2]);

        long totalSec = h1 * b1 * c1 + m1 * c1 + s1;

        int totalUnits = a2 * b2 * c2;
        long total = totalSec * totalUnits / (a1 * b1 * c1);

        int h2 = (int)(total / (b2 * c2));
        total %= (b2 * c2);
        int m2 = (int)(total / c2);
        int s2 = (int)(total % c2);

        pw.println(h2 + " " + m2 + " " + s2);

        pw.flush();
        pw.close();
        br.close();
    }
}
