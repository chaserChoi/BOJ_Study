import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int d = Integer.parseInt(firstLine[1]);

        int[] problemsSolved = new int[n];
        int totalProblems = 0;

        for (int i = 0; i < n; i++) {
            problemsSolved[i] = Integer.parseInt(br.readLine());
            totalProblems += problemsSolved[i];
        }

        int rewardPerProblem = d / totalProblems;

        for (int i = 0; i < n; i++) {
            int reward = problemsSolved[i] * rewardPerProblem;
            bw.write(reward + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
