import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            String[] input = br.readLine().split(" ");
            int d = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);

            if (d == 0 && m == 0 && y == 0)
                break;

            if (y % 4 == 0) {
                cal[2] = 29;
                if (y % 100 == 0 && y % 400 != 0)
                    cal[2] = 28;
            } else
                cal[2] = 28;

            int totalDays = d + sum(cal, m);

            pw.println(totalDays);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    private static int sum(int[] cal, int m) {
        int total = 0;
        for (int i = 1; i < m; i++)
            total += cal[i];

        return total;
    }
}
