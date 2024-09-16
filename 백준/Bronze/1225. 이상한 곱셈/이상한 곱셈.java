import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        String a = line[0];
        String b = line[1];

        long sum = 0;

        for (char c : a.toCharArray()) {
            for (char d : b.toCharArray())
                sum += (c - '0') * (d - '0');
        }

        pw.println(sum);

        pw.flush();
        pw.close();
        br.close();
    }
}
