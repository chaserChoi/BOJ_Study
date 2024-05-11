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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ammo = 0;
        int savedAmmo = 0;
        boolean hasSaved = false;

        for (int i = 0; i < n; i++) {
            String action = br.readLine();
            switch (action) {
                case "save":
                    savedAmmo = ammo;
                    hasSaved = true;
                    break;
                case "load":
                    if (hasSaved) ammo = savedAmmo;
                    else ammo = 0;
                    break;
                case "shoot":
                    ammo--;
                    break;
                case "ammo":
                    ammo += k;
                    break;
            }
            bw.write(ammo + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
