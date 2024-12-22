import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int q = Integer.parseInt(first[1]);

        int[] beats = new int[n];
        for (int i = 0; i < n; i++)
            beats[i] = Integer.parseInt(br.readLine());

        int[] end = new int[n];
        end[0] = beats[0];
        for (int i = 1; i < n; i++)
            end[i] = end[i - 1] + beats[i];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(br.readLine());

            int noteIdx = getNoteIndex(end, t);
            sb.append(noteIdx + 1).append("\n");
        }

        System.out.print(sb);
    }

    private static int getNoteIndex(int[] end, int t) {
        int low = 0, high = end.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (end[mid] <= t)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
