import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        HashSet<String> births = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String birth = br.readLine();
            births.add(birth);
        }

        pw.println(births.size());

        pw.flush();
        pw.close();
        br.close();
    }
}
