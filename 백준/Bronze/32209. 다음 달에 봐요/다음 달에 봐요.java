import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int q = Integer.parseInt(br.readLine());
        int cnt = 0;

        boolean isAdios = false;

        for (int i = 0; i < q; i++) {
            String[] event = br.readLine().split(" ");
            int type = Integer.parseInt(event[0]);
            int c = Integer.parseInt(event[1]);

            if (type == 1)
                cnt += c;
            else if (type == 2) {
                if (cnt < c)
                    isAdios = true;
                else
                    cnt -= c;
            }
        }

        if (isAdios)
            pw.println("Adios");
        else
            pw.println("See you next month");

        pw.flush();
        pw.close();
        br.close();
    }
}
