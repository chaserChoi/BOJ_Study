import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0)
                break;
            int p = Integer.parseInt(st.nextToken());

            List<Integer> result = new ArrayList<>();
            result.add((p & 1) == 1 ? p + 1 : p - 1);
            result.add((p & 1) == 1 ? n - p : n - p + 1);
            result.add((p & 1) == 1 ? n - p + 1 : n - p + 2);

            Collections.sort(result);

            for (Integer i : result)
                System.out.print(i + " ");

            System.out.println();
        }
    }
}
