import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            if (num >= 1 && num <= n)
                set.add(num);
        }

        if (set.size() == n)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
}
