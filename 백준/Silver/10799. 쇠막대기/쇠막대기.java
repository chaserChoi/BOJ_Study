import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        int cnt = 0;
        int open = 0;

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);

            if (curr == '(')
                open++;
            else {
                open--;

                if (input.charAt(i - 1) == '(')
                    cnt += open;
                else
                    cnt++;
            }
        }
        System.out.println(sb.append(cnt));

        br.close();
    }
}