import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] legs = new int[4];
        for (int i = 0; i < 4; i++)
            legs[i] = Integer.parseInt(br.readLine());

        Arrays.sort(legs);

        int b = Integer.parseInt(br.readLine());

        boolean ans = (legs[0] == legs[1] || legs[0] + b == legs[1]) && legs[1] == legs[3];

        System.out.println(ans ? 1 : 0);

        br.close();
    }
}
