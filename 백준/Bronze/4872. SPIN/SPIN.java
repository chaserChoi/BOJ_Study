import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String init = br.readLine();
        int d = init.length();
        int[] wheels = new int[d];

        for (int i = 0; i < d; i++)
            wheels[i] = init.charAt(i) - '0';

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            for (int i = 0; i < d; i++)
                wheels[i] = (wheels[i] + (line.charAt(i) - '0')) % 10;
        }

        for (int w : wheels)
            pw.print(w);
        pw.println();

        pw.flush();
        pw.close();
        br.close();
    }
}
