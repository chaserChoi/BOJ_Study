import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        int h = Integer.parseInt(line.substring(0, 2));
        int m = Integer.parseInt(line.substring(3, 5));

        int totalSeconds = h * 3540 + m * 59;

        int outputHours = totalSeconds / 3600;
        int outputMinutes = (totalSeconds % 3600) / 60;
        int outputSeconds = totalSeconds % 60;

        pw.printf("%02d:%02d:%02d\n", outputHours, outputMinutes, outputSeconds);

        pw.flush();
        pw.close();
        br.close();
    }
}
