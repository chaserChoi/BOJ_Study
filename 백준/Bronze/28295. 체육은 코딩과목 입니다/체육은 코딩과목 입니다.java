import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int direction = 0;

        for (int i = 0; i < 10; i++) {
            int command = Integer.parseInt(br.readLine());

            if (command == 1) direction = (direction + 1) % 4;
            else if (command == 2) direction = (direction + 2) % 4;
            else if (command == 3) direction = (direction + 3) % 4;
        }

        char[] directions = {'N', 'E', 'S', 'W'};
        bw.write(directions[direction]);

        bw.flush();
        bw.close();
        br.close();
    }
}
