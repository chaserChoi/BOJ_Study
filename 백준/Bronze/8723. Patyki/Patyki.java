import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] lengths = new int[3];
        for (int i = 0; i < 3; i++) lengths[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(lengths);

        if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) bw.write("2");
        else if (lengths[0] * lengths[0] + lengths[1] * lengths[1] == lengths[2] * lengths[2]) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}
