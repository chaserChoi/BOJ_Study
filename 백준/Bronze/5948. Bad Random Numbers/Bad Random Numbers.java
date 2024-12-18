import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);

            int middle = (n / 100) % 10 * 10 + (n / 10) % 10;

            n = middle * middle;
        }

        System.out.println(set.size());
    }
}
