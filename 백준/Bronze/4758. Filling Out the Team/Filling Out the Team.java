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

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            double speed = Double.parseDouble(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            int strength = Integer.parseInt(st.nextToken());

            if (speed == 0 && weight == 0 && strength == 0) break;

            StringBuilder pos = new StringBuilder();
            if (speed <= 4.5 && weight >= 150 && strength >= 200) pos.append("Wide Receiver ");

            if (speed <= 6.0 && weight >= 300 && strength >= 500) pos.append("Lineman ");

            if (speed <= 5.0 && weight >= 200 && strength >= 300) pos.append("Quarterback ");

            if (pos.length() == 0) bw.write("No positions\n");
            else bw.write(pos.toString().trim() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
