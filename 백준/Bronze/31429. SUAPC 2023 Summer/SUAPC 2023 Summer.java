import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] rankData = {
            {12, 1600},
            {11, 894},
            {11, 1327},
            {10, 1311},
            {9, 1004},
            {9, 1178},
            {9, 1357},
            {8, 837},
            {7, 1055},
            {6, 556},
            {6, 773},
        };

        int N = Integer.parseInt(br.readLine()) - 1;

        bw.write(rankData[N][0] + " " + rankData[N][1]);
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
