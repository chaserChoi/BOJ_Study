import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int c = Integer.parseInt(size[0]);
        int r = Integer.parseInt(size[1]);

        int mouseX = 0, mouseY = 0;

        String[] movement = br.readLine().split(" ");
        int dx = Integer.parseInt(movement[0]);
        int dy = Integer.parseInt(movement[1]);

        while (dx != 0 || dy != 0) {
            mouseX = Math.min(Math.max(0, mouseX + dx), c);
            mouseY = Math.min(Math.max(0, mouseY + dy), r);

            System.out.println(mouseX + " " + mouseY);

            movement = br.readLine().split(" ");
            dx = Integer.parseInt(movement[0]);
            dy = Integer.parseInt(movement[1]);
        }
    }
}

