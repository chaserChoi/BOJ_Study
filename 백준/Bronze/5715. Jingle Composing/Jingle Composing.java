import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("*")) break;

            int ans = 0;
            double duration = 0.0;
            for (char c : line.toCharArray()) {
                switch (c) {
                    case '/':
                        if (duration == 1.0) ans++;
                        duration = 0.0;
                        break;
                    case 'W':
                        duration += 1.0;
                        break;
                    case 'H':
                        duration += 0.5;
                        break;
                    case 'Q':
                        duration += 0.25;
                        break;
                    case 'E':
                        duration += 0.125;
                        break;
                    case 'S':
                        duration += 0.0625;
                        break;
                    case 'T':
                        duration += 0.03125;
                        break;
                    case 'X':
                        duration += 0.015625;
                        break;
                }
            }
            System.out.println(ans);
        }

        br.close();
    }
}
