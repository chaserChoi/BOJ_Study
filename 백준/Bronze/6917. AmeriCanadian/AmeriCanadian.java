import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word;
        while (true) {
            word = br.readLine();
            if (word.equals("quit!")) break;
            System.out.println(translate(word));
        }
    }

    private static String translate(String word) {
        if (word.length() > 4 && word.endsWith("or") && isConsonant(word.charAt(word.length() - 3))) {
            return word.substring(0, word.length() - 2) + "our";
        }
        return word;
    }

    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) >= 0;
    }
}

