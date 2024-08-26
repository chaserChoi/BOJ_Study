import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String dir = br.readLine();

        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;

        for (char d : dir.toCharArray()) {
            switch (d) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'W':
                    west++;
                    break;
                case 'E':
                    east++;
                    break;
            }
        }

        pw.println(n - Math.max(Math.max(north, south), Math.max(west, east)));

        pw.flush();
        pw.close();
        br.close();
    }
}
