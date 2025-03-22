import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String str = br.readLine();

            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                if (c != ' ')
                    freq[c - 'a']++;
            }

            int maxCount = 0;
            char maxChar = '?';
            boolean isAmbiguous = false;

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > maxCount) {
                    maxCount = freq[i];
                    maxChar = (char) (i + 'a');
                    isAmbiguous = false;
                } else if (freq[i] == maxCount && maxCount > 0) {
                    isAmbiguous = true;
                }
            }

            if (isAmbiguous)
                sb.append('?').append("\n");
            else
                sb.append(maxChar).append("\n");
        }

        System.out.print(sb);
    }
}
