import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long mariTotal = 0, juriTotal = 0;
        int mariCnt = 0, juriCnt = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            char c = input[0].charAt(0);
            int p = Integer.parseInt(input[1]);

            if (c == 'M') {
                mariCnt++;
                mariTotal += p;
            } else {
                juriCnt++;
                juriTotal += p;
            }
        }

        double mariAvg = (mariCnt != 0) ? (double) mariTotal / mariCnt : 0;
        double juriAvg = (juriCnt != 0) ? (double) juriTotal / juriCnt : 0;

        if (mariAvg > juriAvg) 
            pw.println('M');
        else if (mariAvg < juriAvg) 
            pw.println('J');
        else 
            pw.println('V');

        pw.flush();
        pw.close();
        br.close();
    }
}
