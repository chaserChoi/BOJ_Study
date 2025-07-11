import java.io.*;
import java.util.*;

public class Main {
    static final char[] map = new char[26];
    static {
        String[] keys = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < keys.length; i++) {
            for (char c : keys[i].toCharArray())
                map[c - 'a'] = (char) ('2' + i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] dict = new String[n];
        for (int i = 0; i < n; i++)
            dict[i] = br.readLine();
        String str = br.readLine();
        int ans = 0;

        for (String word : dict) {
            if (word.length() != str.length()) continue;
            boolean match = true;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (map[ch - 'a'] != str.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) ans++;
        }
        sb.append(ans);

        System.out.println(sb);

        br.close();
    }
}