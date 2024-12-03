import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String caesar = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char ch : caesar.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char original = (char) (ch - 3);
                if (original < 'A')
                    original += 26;
                sb.append(original);
            }
        }

        System.out.println(sb.toString());
    }
}
