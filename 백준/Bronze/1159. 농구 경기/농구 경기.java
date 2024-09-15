import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String sur = br.readLine();
            char first = sur.charAt(0);
            map.put(first, map.getOrDefault(first, 0) + 1);
        }

        Set<Character> res = new TreeSet<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5)
                res.add(entry.getKey());
        }

        if (res.isEmpty())
            pw.println("PREDAJA");
        else {
            for (char c : res)
                pw.print(c);
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
