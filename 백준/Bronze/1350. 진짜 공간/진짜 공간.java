import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int cluster = Integer.parseInt(br.readLine());

        long total = 0;

        for (int i = 0; i < n; i++) {
            int file = Integer.parseInt(arr[i]);
            if (file > 0) {
                long need = (long) Math.ceil((double) file / cluster);
                total += need * cluster;
            }
        }

        pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
