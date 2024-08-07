import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int y = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int d = m;

            int target = d - m;

            if (target < 1) {
                m--;
                if (m < 1) {
                    m = 12;
                    y--;
                }
                target += getDaysInMonth(y, m);
            }

            pw.println(y + " " + m + " " + target);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    return 29;
                else
                    return 28;
            default:
                return 0;
        }
    }
}
