import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!(line = br.readLine()).equals("END")) {
            StringTokenizer st = new StringTokenizer(line, ",");
            double x = 0.0;
            double y = 0.0;

            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (token.charAt(token.length() - 1) == '.') {
                    token = token.substring(0, token.length() - 1);
                }

                int length;
                String direction;

                if (Character.isAlphabetic(token.charAt(token.length() - 2))) {
                    length = Integer.parseInt(token.substring(0, token.length() - 2));
                    direction = token.substring(token.length() - 2);
                } else {
                    length = Integer.parseInt(token.substring(0, token.length() - 1));
                    direction = token.substring(token.length() - 1);
                }

                switch (direction) {
                    case "N":
                        y += length;
                        break;
                    case "S":
                        y -= length;
                        break;
                    case "E":
                        x += length;
                        break;
                    case "W":
                        x -= length;
                        break;
                    case "NE":
                        x += Math.sqrt(2) * length / 2;
                        y += Math.sqrt(2) * length / 2;
                        break;
                    case "NW":
                        x -= Math.sqrt(2) * length / 2;
                        y += Math.sqrt(2) * length / 2;
                        break;
                    case "SE":
                        x += Math.sqrt(2) * length / 2;
                        y -= Math.sqrt(2) * length / 2;
                        break;
                    case "SW":
                        x -= Math.sqrt(2) * length / 2;
                        y -= Math.sqrt(2) * length / 2;
                        break;
                }
            }

            double distance = Math.hypot(x, y);
            sb.append(String.format("You can go to (%.3f,%.3f), the distance is %.3f steps.\n", x, y, distance));
        }

        System.out.print(sb);
    }
}
