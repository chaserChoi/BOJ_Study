import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phrase1 = br.readLine();
        String phrase2 = br.readLine();

        char[] a = (phrase1.replace(" ", "")).toCharArray();
        char[] b = (phrase2.replace(" ", "")).toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Is an anagram.");
        else
            System.out.println("Is not an anagram.");
    }
}

