import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int usaG = Integer.parseInt(line[0]);
            int usaS = Integer.parseInt(line[1]);
            int usaB = Integer.parseInt(line[2]);
            int rusG = Integer.parseInt(line[3]);
            int rusS = Integer.parseInt(line[4]);
            int rusB = Integer.parseInt(line[5]);

            int usaTotal = usaG + usaS + usaB;
            int rusTotal = rusG + rusS + rusB;

            boolean usaWin = usaTotal > rusTotal;
            boolean usaColor = false;

            if (usaG > rusG)
                usaColor = true;
            else if (usaG == rusG) {
                if (usaS > rusS)
                    usaColor = true;
                else if (usaS == rusS) {
                    if (usaB > rusB)
                        usaColor = true;
                }
            }

            pw.println(String.join(" ", line));
            if (usaWin && usaColor)
                pw.println("both");
            else if (usaWin)
                pw.println("count");
            else if (usaColor)
                pw.println("color");
            else
                pw.println("none");
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
