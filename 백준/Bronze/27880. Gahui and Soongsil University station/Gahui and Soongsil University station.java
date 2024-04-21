import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int ESCALATOR_STEP_HEIGHT = 21;
        final int STAIR_STEP_HEIGHT = 17;
        int depth = 0;

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            String type = st.nextToken();
            int steps = Integer.parseInt(st.nextToken());
            if (type.equals("Es")) depth += steps * ESCALATOR_STEP_HEIGHT;
            else if (type.equals("Stair")) depth += steps * STAIR_STEP_HEIGHT;
        }

        bw.write(String.valueOf(depth));

        br.close();
        bw.flush();
        bw.close();
    }
}
