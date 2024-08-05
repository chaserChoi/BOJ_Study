import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int b = Integer.parseInt(line[0]);
        int d = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int l = Integer.parseInt(line[3]);
        boolean flag = true;

        for (int i = 0; i <= 250; i++) {
            for (int j = 0; j <= 250; j++) {
                for (int k = 0; k <= 250; k++) {
                    if (b * i + d * j + c * k == l) {
                        pw.println(i + " " + j + " " + k);
                        flag = false;
                    }
                }
            }
        }

        if (flag) pw.println("impossible");

        pw.flush();
        pw.close();
        br.close();
    }
}
