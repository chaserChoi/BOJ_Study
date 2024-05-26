import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sides = new int[4];
        for (int i = 0; i < 4; i++) sides[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(sides);
        int maxArea = sides[0] * sides[2];

        bw.write(maxArea + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
