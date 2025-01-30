import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String solveShiftLetters(String s, int shiftBy) {

        int len = s.length();

        StringBuilder sb = new StringBuilder(len);

        int startIdx = (len - shiftBy) % len;

        sb.append(s.substring(startIdx));
        sb.append(s.substring(0, startIdx));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++) {
            String s = sc.next();
            int shiftBy = sc.nextInt();

            System.out.println("Shifting " + s + " by " + shiftBy + " positions gives us: " + solveShiftLetters(s, shiftBy));
        }

        sc.close();
    }
}
