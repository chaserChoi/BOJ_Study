import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String circular = br.readLine();
            String smallest = findLex(circular);
            sb.append(smallest).append("\n");
        }

        System.out.print(sb);
    }

    private static String findLex(String sequence) {
        int n = sequence.length();
        String smallest = sequence;

        for (int i = 1; i < n; i++) {
            String candidate = sequence.substring(i) + sequence.substring(0, i);
            if (candidate.compareTo(smallest) < 0)
                smallest = candidate;
        }

        return smallest;
    }
}
