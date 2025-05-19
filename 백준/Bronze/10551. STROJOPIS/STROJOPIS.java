import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int[] counts = new int[8];

        for (char c : input.toCharArray()) {
            switch (c) {
                case '1': case 'Q': case 'A': case 'Z':
                    counts[0]++;
                    break;
                case '2': case 'W': case 'S': case 'X':
                    counts[1]++;
                    break;
                case '3': case 'E': case 'D': case 'C':
                    counts[2]++;
                    break;
                case '4': case '5': case 'R': case 'T':
                case 'F': case 'G': case 'V': case 'B':
                    counts[3]++;
                    break;
                case '6': case '7': case 'Y': case 'U':
                case 'H': case 'J': case 'N': case 'M':
                    counts[4]++;
                    break;
                case '8': case 'I': case 'K': case ',':
                    counts[5]++;
                    break;
                case '9': case 'O': case 'L': case '.':
                    counts[6]++;
                    break;
                case '0': case '-': case '=': case 'P':
                case '[': case ']': case ';': case '\'':
                case '/': case '\\':
                    counts[7]++;
                    break;
            }
        }

        for (int count : counts) {
            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
