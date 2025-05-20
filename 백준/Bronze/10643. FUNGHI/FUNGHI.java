import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> mushrooms = new ArrayList<>();
        for (int i = 0; i < 8; i++)
            mushrooms.add(Integer.parseInt(br.readLine()));

        for (int i = 0; i < 3; i++)
            mushrooms.add(mushrooms.get(i));

        int max = 0;

        for (int i = 0; i < 8; i++) {
            int curr = 0;
            curr += mushrooms.get(i);
            curr += mushrooms.get(i + 1);
            curr += mushrooms.get(i + 2);
            curr += mushrooms.get(i + 3);

            if (curr > max)
                max = curr;
        }

        bw.write(String.valueOf(max));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
