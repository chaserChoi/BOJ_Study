import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            List<String> v = new ArrayList<>();
            for (int i = 0; i < n; i++)
                v.add(br.readLine());

            int step = 0;
            while (true) {
                for (int i = 0; i < n; i++) {
                    if (!v.get(i).isEmpty())
                        v.set(i, v.get(i).substring(1));
                }
                if (check(n, v)) break;
                step++;
            }
            System.out.println(step);
        }
    }

    private static boolean check(int n, List<String> v) {
        for (int i = 0; i < n; i++) {
            if (v.get(i).isEmpty())
                return true;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v.get(i).equals(v.get(j)))
                    return true;
            }
        }
        return false;
    }
}
