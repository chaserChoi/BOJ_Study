import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int modularInverse = findModularInverse(x, m);

        if (modularInverse == -1)
            System.out.println("No such integer exists.");
        else
            System.out.println(modularInverse);
    }

    private static int findModularInverse(int x, int m) {
        for (int i = 1; i < m; i++) {
            if ((x * i) % m == 1)
                return i;
        }
        return -1;
    }
}

