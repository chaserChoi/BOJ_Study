import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (true) {
            line = br.readLine();
            String[] parts = line.split(" ");
            double x = Double.parseDouble(parts[0]);
            double y = Double.parseDouble(parts[1]);

            if (x == 0 && y == 0) break;

            int hour = (int) Math.ceil((x * x + y * y) * Math.PI / 100);
            System.out.println("The property will be flooded in hour " + hour + ".");
        }
    }
}
