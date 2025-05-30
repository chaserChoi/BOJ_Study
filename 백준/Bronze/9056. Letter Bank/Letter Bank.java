import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String line = br.readLine();
            String[] words = line.split(" ");
            String bank = words[0];
            String target = words[1];

            HashSet<Character> set = new HashSet<>();
            for (char c : target.toCharArray()) {
                set.add(c);
            }

            boolean canForm = true;
            for (char c : bank.toCharArray()) {
                if (!set.contains(c)) {
                    canForm = false;
                    break;
                }
                set.remove(c);
            }

            sb.append(canForm && set.isEmpty() ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}
