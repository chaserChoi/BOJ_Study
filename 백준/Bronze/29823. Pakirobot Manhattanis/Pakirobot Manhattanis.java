import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String directions = br.readLine();
        int north = 0, south = 0, east = 0, west = 0;

        for (int i = 0; i < N; i++) {
            char direction = directions.charAt(i);
            switch (direction) {
                case 'N': north++; break;
                case 'S': south++; break;
                case 'E': east++; break;
                case 'W': west++; break;
            }
        }

        int vertical = Math.abs(north - south);
        int horizontal = Math.abs(east - west);
        int minSteps = vertical + horizontal;

        bw.write(String.valueOf(minSteps));
        bw.newLine();

        br.close();
        bw.close();
    }
}
