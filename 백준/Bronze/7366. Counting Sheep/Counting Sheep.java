import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i =1; i <= n; i++) {
            int m = Integer.parseInt(br.readLine());
            String[] words = br.readLine().split(" ");

            int sheep = 0;
            for (String word : words) {
                if (word.equals("sheep"))
                    sheep++;
            }

            sb.append("Case ").append(i).append(": This list contains ").append(sheep).append(" sheep.\n");

            if (i < n)
                sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
