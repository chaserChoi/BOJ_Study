import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mother = br.readLine();
        String father = br.readLine();

        int x = Integer.parseInt(br.readLine());

        while (x-- > 0) {
            String baby = br.readLine();
            System.out.println(isPossibleBaby(mother, father, baby) ? "Possible baby." : "Not their baby!");
        }
    }

    private static boolean isPossibleBaby(String mother, String father, String baby) {
        for (char c : baby.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                if (mother.indexOf(c) == -1 || father.indexOf(c) == -1)
                    return false;
            } else {
                if (mother.indexOf(c) == -1 && father.indexOf(c) == -1)
                    return false;
            }
        }
        return true;
    }
}

