import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);

        int[] preferences = new int[m];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++)
                preferences[j] += Integer.parseInt(line[j]);
        }

        Integer[][] places = new Integer[m][2];

        for (int i = 0; i < m; i++) {
            places[i][0] = i + 1;
            places[i][1] = preferences[i];
        }

        Arrays.sort(places, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                if (b[1].equals(a[1]))
                    return a[0].compareTo(b[0]);
                return b[1].compareTo(a[1]);
            }
        });

        for (int i = 0; i < m; i++)
            System.out.print(places[i][0] + " ");
        System.out.println();
    }
}
