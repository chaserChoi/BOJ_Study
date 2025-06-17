import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] postfix = new String[str.length()];

        for (int i = 0; i < str.length(); i++)
            postfix[i] = str.substring(i);

        Arrays.sort(postfix);

        for (String s : postfix)
          sb.append(s).append("\n");

        System.out.println(sb);

        br.close();
    }
}
