import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String curr = br.readLine();
        String start = br.readLine();

        int currSec = convertToSeconds(curr);
        int startSec = convertToSeconds(start);

        int totalSec = 86400;
        int remain = (startSec - currSec + totalSec) % totalSec;

        String ans = convertToTimeFormat(remain);

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int convertToSeconds(String t) {
        String[] parts = t.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        
        return h * 3600 + m * 60 + s;
    }

    private static String convertToTimeFormat(int sec) {
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int remain = sec % 60;

        return String.format("%02d:%02d:%02d", h, m, remain);
    }
}
