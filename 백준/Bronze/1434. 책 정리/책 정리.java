import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[] box = new int[n];
        String[] boxLine = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            box[i] = Integer.parseInt(boxLine[i]);

        int[] book = new int[m];
        String[] bookLine = br.readLine().split(" ");
        for (int i = 0; i < m; i++)
            book[i] = Integer.parseInt(bookLine[i]);

        int total = 0;
        int currBook = 0;

        for (int i = 0; i < n; i++) {
            int currBox = box[i];
            int used = 0;

            while (currBook < m && used + book[currBook] <= currBox) {
                used += book[currBook];
                currBook++;
            }

            total += (currBox - used);
        }

        pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
