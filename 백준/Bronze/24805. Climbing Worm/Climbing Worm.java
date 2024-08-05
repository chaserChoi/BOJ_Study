import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int h = Integer.parseInt(line[2]);

        int cur = 0;
        int climbs = 0;

        while (true)
        {
            climbs++;
            cur += a;

            if (cur >= h)
                break;

            cur -= b;
        }

        pw.println(climbs);

        pw.flush();
        pw.close();
        br.close();
    }
}
