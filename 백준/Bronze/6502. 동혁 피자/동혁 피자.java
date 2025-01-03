import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int pizza = 1;

        while (true) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            if (r == 0) break;
            int w = Integer.parseInt(input[1]);
            int l = Integer.parseInt(input[2]);

            double radius = Math.sqrt((w * w) + (l * l)) / 2;
            if (radius <= r)
                sb.append("Pizza ").append(pizza).append(" fits on the table.\n");
            else
                sb.append("Pizza ").append(pizza).append(" does not fit on the table.\n");
            pizza++;
        }

        System.out.println(sb);
    }
}
