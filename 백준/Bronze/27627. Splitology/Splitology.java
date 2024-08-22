import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int n = s.length();

        for (int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i);
            if (isPalindrome(a) && isPalindrome(b)) {
                pw.println(a + " " + b);

                pw.flush();
                pw.close();
                br.close();
                return;
            }
        }

        pw.println("NO");

        pw.flush();
        pw.close();
        br.close();
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}
