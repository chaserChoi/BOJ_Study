import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] pos = br.readLine().split(" ");
        int xLuka = Integer.parseInt(pos[0]);
        int yLuka = Integer.parseInt(pos[1]);

        int k = Integer.parseInt(br.readLine());
        String moves = br.readLine();

        List<Integer> hearingTimes = new ArrayList<>();

        int xTask = 0;
        int yTask = 0;

        for (int i = 0; i < k; i++) {
            char move = moves.charAt(i);

            if (isHearing(xTask, yTask, xLuka, yLuka))
                hearingTimes.add(i);

            switch (move) {
                case 'I':
                    xTask++;
                    break;
                case 'S':
                    yTask++;
                    break;
                case 'Z':
                    xTask--;
                    break;
                case 'J':
                    yTask--;
                    break;
            }
        }

        if (isHearing(xTask, yTask, xLuka, yLuka))
            hearingTimes.add(k);

        if (hearingTimes.isEmpty())
            System.out.println("-1");
        else {
            for (int time : hearingTimes)
                System.out.println(time);
        }
    }

    private static boolean isHearing(int xTask, int yTask, int xLuka, int yLuka) {
        return (Math.abs(xTask - xLuka) <= 1 && Math.abs(yTask - yLuka) <= 1);
    }
}
