import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int maxSafe = 1;
        int minBroken = k;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int floor = Integer.parseInt(st.nextToken());
            String res = st.nextToken();

            if (res.equals("SAFE"))
                maxSafe = Math.max(maxSafe, floor);
            else
                minBroken = Math.min(minBroken, floor);
        }

        int lowest = maxSafe + 1;
        int highest = minBroken - 1;

        System.out.println(sb.append(lowest + " " + highest));

        br.close();
    }
}