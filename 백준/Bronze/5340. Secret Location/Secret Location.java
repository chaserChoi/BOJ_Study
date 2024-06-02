import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[6];

        for (int i = 0; i < 6; i++) {
            String s = br.readLine();
            if (s.charAt(s.length() - 1) == ' ') list[i] = s.length() - 1;
            else list[i] = s.length();
        }

        bw.write("Latitude " + list[0] + ":" + list[1] + ":" + list[2] + "\n");
        bw.write("Longitude " + list[3] + ":" + list[4] + ":" + list[5] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
