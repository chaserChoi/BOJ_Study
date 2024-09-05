import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String data = br.readLine().trim();
        String[] parts = data.split("/");

        int aa = Integer.parseInt(parts[0]);
        int bb = Integer.parseInt(parts[1]);
        int cccc = Integer.parseInt(parts[2]);

        boolean isUS = (aa >= 1 && aa <= 12) && (bb >= 1 && bb <= 31);
        boolean isEU = (bb >= 1 && bb <= 12) && (aa >= 1 && aa <= 31);

        if (isUS && !isEU)
            pw.println("US");
        else if (!isUS && isEU)
            pw.println("EU");
        else
            pw.println("either");

        pw.flush();
        pw.close();
        br.close();
    }
}
