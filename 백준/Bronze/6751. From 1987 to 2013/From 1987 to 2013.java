import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        int nexYear = y + 1;
        while (true) {
            if (hasDistrictDigits(nexYear)) {
                System.out.println(nexYear);
                break;
            }
            nexYear++;
        }
    }

    private static boolean hasDistrictDigits(int year) {
        boolean[] seen = new boolean[10];
        while (year > 0) {
            int digit = year % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            year /= 10;
        }
        return true;
    }
}

