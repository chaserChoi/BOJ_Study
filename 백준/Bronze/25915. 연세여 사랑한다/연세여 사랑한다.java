import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        char c = br.readLine().charAt(0);

        String pwd = "ILOVEYONSEI";

        int curPos = c - 'A';
        int totalDist = 0;

        for (char ch : pwd.toCharArray()) {
            int targetPos = ch - 'A';
            totalDist += Math.abs(targetPos - curPos);
            curPos = targetPos;
        }

        pw.println(totalDist);

        pw.flush();
        pw.close();
        br.close();
    }
}
