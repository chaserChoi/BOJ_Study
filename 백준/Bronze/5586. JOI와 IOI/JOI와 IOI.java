import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int cntJOI = 0;
        int cntIOI = 0;

        int len = input.length();

        for (int i = 0; i < len - 2; i++) {
            String substring = input.substring(i, i + 3);
            if (substring.equals("JOI"))
                cntJOI++;
            else if (substring.equals("IOI"))
                cntIOI++;
        }

        System.out.println(cntJOI);
        System.out.println(cntIOI);
    }
}
