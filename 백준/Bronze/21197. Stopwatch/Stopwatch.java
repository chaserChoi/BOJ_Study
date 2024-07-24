import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total = 0;
        int last = 0;
        boolean running = false;

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            if (running)
                total += (cur - last);

            running = !running;
            last = cur;
        }

        if (running)
            System.out.println("still running");
        else
            System.out.println(total);
    }
}
