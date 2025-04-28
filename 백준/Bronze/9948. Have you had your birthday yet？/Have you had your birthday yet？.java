import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    private static final Map<String, Integer> monthMap = new HashMap<>();

    static {
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;
        while ((line = br.readLine()) != null && !line.equals("0 #")) {
            st = new StringTokenizer(line);
            int d = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (d == 29 && name.equals("February")) {
                bw.write("Unlucky");
                bw.newLine();
                continue;
            }

            if (d == 4 && name.equals("August")) {
                bw.write("Happy birthday");
                bw.newLine();
                continue;
            }

            int m = monthMap.get(name);

            if (m < 8)
                bw.write("Yes");
            else if (m > 8)
                bw.write("No");
            else {
                if (d < 4)
                    bw.write("Yes");
                else
                    bw.write("No");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}