import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];

        for (int i = 0; i < seq.length; i++)
            seq[i] = Integer.parseInt(br.readLine());

        if (seq[2] - seq[1] == seq[1] - seq[0])
            pw.println(seq[seq.length - 1] + (seq[1] - seq[0]));
        else
            pw.println(seq[seq.length - 1] * (seq[1] / seq[0]));

        pw.flush();
        pw.close();
        br.close();
    }
}
