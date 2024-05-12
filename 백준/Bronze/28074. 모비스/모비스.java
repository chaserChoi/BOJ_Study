import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] count = new int[5];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'M':
                    count[0]++;
                    break;
                case 'O':
                    count[1]++;
                    break;
                case 'B':
                    count[2]++;
                    break;
                case 'I':
                    count[3]++;
                    break;
                case 'S':
                    count[4]++;
                    break;
            }
        }

        boolean canMakeMOBIS = true;
        for (int i = 0; i < 5; i++) {
            if (count[i] == 0) {
                canMakeMOBIS = false;
                break;
            }
        }

        if (canMakeMOBIS) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        br.close();
        bw.close();
    }
}
