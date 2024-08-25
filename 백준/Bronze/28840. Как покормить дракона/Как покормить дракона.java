import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] today = br.readLine().split(":");
        int tH = Integer.parseInt(today[0]);
        int tM = Integer.parseInt(today[1]);

        String[] tomorrow = br.readLine().split(":");
        int tmH = Integer.parseInt(tomorrow[0]);
        int tmM = Integer.parseInt(tomorrow[1]);

        int todaytotal = 24 * 60 - (tH * 60 + tM);
        int tomorrowtotal = tmH * 60 + tmM;

        int total = tomorrowtotal + todaytotal;

        int H = total / 60;
        int M = total % 60;

        pw.printf("%02d:%02d\n", H, M);

        pw.flush();
        pw.close();
        br.close();
    }
}
