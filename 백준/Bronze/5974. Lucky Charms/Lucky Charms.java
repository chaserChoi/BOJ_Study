import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int l = Integer.parseInt(first[0]);
        int c = Integer.parseInt(first[1]);
        int n = Integer.parseInt(first[2]);

        for (int i = 0; i < c; i++) {
            String[] charm = br.readLine().split(" ");
            int s = Integer.parseInt(charm[0]);
            int p = Integer.parseInt(charm[1]);

            int dist = Math.abs(p - n) + s;

            System.out.println(dist);
        }
    }
}
