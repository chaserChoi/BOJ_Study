import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;

            String a0 = String.format("%04d", Integer.parseInt(input));
            HashSet<String> set = new HashSet<>();
            set.add(a0);

            String curr = a0;

            while (true) {
                long square = Long.parseLong(curr) * Long.parseLong(curr);
                String squareStr = String.format("%08d", square);
                curr = squareStr.substring(2, 6);
                if (set.contains(curr)) break;
                set.add(curr);
            }

            sb.append(set.size()).append("\n");
        }
        System.out.print(sb);
    }
}
