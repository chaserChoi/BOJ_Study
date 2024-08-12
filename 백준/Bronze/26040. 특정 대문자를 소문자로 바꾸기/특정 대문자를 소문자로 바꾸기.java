import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();

        Set<Character> upper = new HashSet<>();
        for (String l : B.split(" "))
            upper.add(l.charAt(0));

        for (char c : A.toCharArray()) {
            if (upper.contains(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
