import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String per = "PER";
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != per.charAt(i % 3))
                cnt++;
        }

        System.out.println(sb.append(cnt));

        br.close();
    }
}