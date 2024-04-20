import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> pepperSHU = new HashMap<>();
        pepperSHU.put("Poblano", 1500);
        pepperSHU.put("Mirasol", 6000);
        pepperSHU.put("Serrano", 15500);
        pepperSHU.put("Cayenne", 40000);
        pepperSHU.put("Thai", 75000);
        pepperSHU.put("Habanero", 125000);

        int N = Integer.parseInt(br.readLine());
        int totalSHU = 0;

        for (int i = 0; i < N; i++) {
            String pepperName = br.readLine();
            totalSHU += pepperSHU.get(pepperName);
        }

        bw.write(String.valueOf(totalSHU));

        bw.flush();
        br.close();
        bw.close();
    }
}
