import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int size = Integer.parseInt(br.readLine());

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1) bw.write("#");
                    else {
                        if (j == 0 || j == size - 1) bw.write("#");
                        else bw.write("J");
                    }
                }
                bw.newLine();
            }

            if (t < T - 1) bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close(); 
    }
}
