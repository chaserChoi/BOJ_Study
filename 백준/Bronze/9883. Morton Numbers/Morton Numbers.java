import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        long morton = 0;
        for (int i = 0; i < 16; i++) {
            if ((y & (1 << i)) != 0)
                morton |= (1L << 2 * i);
            if ((x & (1 << i)) != 0)
                morton |= (1L << 2 * i + 1);
        }
        System.out.println(morton);
    }
}