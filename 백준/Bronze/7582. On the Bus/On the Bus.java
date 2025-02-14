import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("# 0")) {
            String[] first = line.split(" ");
            String routeNum = first[0];
            int busSize = Integer.parseInt(first[1]);

            int curr = Integer.parseInt(br.readLine());
            int stops = Integer.parseInt(br.readLine());

            for (int i = 0; i < stops; i++) {
                String[] stopInfo = br.readLine().split(" ");
                int getOff = Integer.parseInt(stopInfo[0]);
                int getOn = Integer.parseInt(stopInfo[1]);

                curr -= getOff;

                if (curr < 0)
                    curr = 0;

                int available = busSize - curr;

                if (getOn > available)
                    curr += available;
                else
                    curr += getOn;
            }

            System.out.println(routeNum + " " + curr);
        }
    }
}
