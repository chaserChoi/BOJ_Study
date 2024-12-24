import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        final int MAX = 1000000;
        int[] arr = new int[MAX];
        int start = 5, end = 5;

        char c;
        while ((c = (char) br.read()) != '\n') {
            addBits(arr, c, end);
            end += 4;
        }

        while ((end - start) % 3 != 0)
            start--;

        boolean printed = false;
        while (start < end) {
            int n = 4 * arr[start] + 2 * arr[start + 1] + arr[start + 2];
            if (printed || n != 0) {
                printed = true;
                pw.print(n);
            }
            start += 3;
        }
        if (!printed)
            pw.print("0");

        pw.println();
        pw.flush();
    }

    private static void addBits(int[] arr, char c, int end) {
        int n;
        if (c >= '0' && c <= '9')
            n = c - '0';
        else
            n = 10 + (c - 'A');

        arr[end] = (n / 8) % 2;
        arr[end + 1] = (n / 4) % 2;
        arr[end + 2] = (n / 2) % 2;
        arr[end + 3] = n % 2;
    }
}
