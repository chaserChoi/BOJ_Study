import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int patternLen = 2 * n + 1;
        int cnt = 0;

        int i = 0;
        while (i <= m - patternLen) {
            if (S.charAt(i) == 'I') {
                int j;
                for (j = 1; j < patternLen; j++) {
                    if (j % 2 == 1) {
                        if (S.charAt(i + j) != 'O')
                            break;
                    } else {
                        if (S.charAt(i + j) != 'I')
                            break;
                    }
                }
                if (j == patternLen) {
                    cnt++;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        System.out.println(cnt);
    }
}
