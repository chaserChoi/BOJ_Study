import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : line.toCharArray())
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        boolean hasOdd = false;
        boolean hasEven = false;

        for (int cnt : freq.values()) {
            if (cnt % 2 == 0)
                hasEven = true;
            else hasOdd = true;
        }

        if (hasOdd && hasEven)
            pw.println("0/1");
        else if (hasOdd)
            pw.println("1");
        else
            pw.println("0");

        pw.flush();
        pw.close();
        br.close();
    }
}
