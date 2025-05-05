import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String lower = line.toLowerCase();

            boolean isPalindrome = true;

            int left = 0;
            int right = lower.length() - 1;

            while (left < right) {
                if (lower.charAt(left) != lower.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome)
                bw.write("Yes");
            else
                bw.write("No");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}