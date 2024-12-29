import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int q = Integer.parseInt(first[1]);

        boolean[] slots = new boolean[n + 1];

        for (int i = 0; i < q; i++) {
            String[] cmd = br.readLine().split(" ");
            int l = Integer.parseInt(cmd[0]);
            int I = Integer.parseInt(cmd[1]);

            for (int j = l; j <= n; j += I)
                slots[j] = true;
        }

        int empty = 0;
        for (int i = 1; i <= n; i++) {
            if (!slots[i])
                empty++;
        }

        System.out.println(empty);
    }
}
