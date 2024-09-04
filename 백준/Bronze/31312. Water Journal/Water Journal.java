import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] firLine = br.readLine().split(" ");
        int n = Integer.parseInt(firLine[0]);
        int a = Integer.parseInt(firLine[1]);
        int b = Integer.parseInt(firLine[2]);

        Set<Integer> logged = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            int w = Integer.parseInt(br.readLine());
            logged.add(w);
        }

        boolean hasMin = logged.contains(a);
        boolean hasMax = logged.contains(b);

        if (!hasMin && !hasMax)
            pw.println(-1);
        else if (!hasMin)
            pw.println(a);
        else if (!hasMax)
            pw.println(b);
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = a; i <= b; i++)
                sb.append(i).append("\n");
            pw.print(sb.toString());
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
