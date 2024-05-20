import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int burger1 = Integer.parseInt(br.readLine());
        int burger2 = Integer.parseInt(br.readLine());
        int burger3 = Integer.parseInt(br.readLine());
        int drink1 = Integer.parseInt(br.readLine());
        int drink2 = Integer.parseInt(br.readLine());

        int minBurger = Math.min(burger1, Math.min(burger2, burger3));

        int minDrink = Math.min(drink1, drink2);

        int setPrice = minBurger + minDrink - 50;

        bw.write(setPrice + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
