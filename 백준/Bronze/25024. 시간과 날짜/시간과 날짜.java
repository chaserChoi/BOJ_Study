import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            String time = (x >= 0 && x <= 23 && y >= 0 && y <= 59) ? "Yes" : "No";

            String date = "No";
            if (x >= 1 && x <= 12) {
                if (y >= 1) {
                    if (x == 2)
                        date = (y <= 29) ? "Yes" : "No";
                    else if (x == 4 || x == 6 || x == 9 || x == 11)
                        date = (y <= 30) ? "Yes" : "No";
                    else
                        date = (y <= 31) ? "Yes" : "No";
                }
            }

            pw.println(time + " " + date);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
