import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int trout = Integer.parseInt(br.readLine());
        int pike = Integer.parseInt(br.readLine());
        int pickerel = Integer.parseInt(br.readLine());
        int total = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i * trout <= total; i++) {
            for (int j = 0; j * pike <= total; j++) {
                for (int k = 0; k * pickerel <= total; k++) {
                    int curr = i * trout + j * pike + k * pickerel;

                    if (curr <= total && (i + j + k) > 0) {
                        System.out.printf("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel%n", i, j, k);
                        cnt++;
                    }
                }
            }
        }

        System.out.printf("Number of ways to catch fish: %d%n", cnt);
    }
}

