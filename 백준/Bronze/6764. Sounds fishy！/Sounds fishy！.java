import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] depths = new int[4];
        for (int i = 0; i < 4; i++) depths[i] = Integer.parseInt(br.readLine());

        boolean rising = true, diving = true, constant = true;
        for (int i = 1; i < 4; i++) {
            if (depths[i] <= depths[i-1]) rising = false;
            if (depths[i] >= depths[i-1]) diving = false;
            if (depths[i] != depths[i-1]) constant = false;
        }

        if (rising) bw.write("Fish Rising");
        else if (diving) bw.write("Fish Diving");
        else if (constant) bw.write("Fish At Constant Depth");
        else bw.write("No Fish");

        bw.flush();
        bw.close();
        br.close();
    }
}
