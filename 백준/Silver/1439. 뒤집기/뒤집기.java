import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        StringTokenizer str1 = new StringTokenizer(str, "0");
        StringTokenizer str0 = new StringTokenizer(str, "1");

        System.out.println(Math.min(str1.countTokens(), str0.countTokens()));

        br.close();
    }
}
