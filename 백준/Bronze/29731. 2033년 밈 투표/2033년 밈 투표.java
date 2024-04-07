import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] originalPromises = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        int N = Integer.parseInt(br.readLine());
        boolean changed = false;

        for (int i = 0; i < N; i++) {
            String promise = br.readLine();
            boolean isOriginal = false;
            for (String originalPromise : originalPromises) {
                if (promise.equals(originalPromise)) {
                    isOriginal = true;
                    break;
                }
            }
            if (!isOriginal) {
                changed = true;
                break;
            }
        }

        if (changed) bw.write("Yes");
        else bw.write("No");


        bw.flush();
        bw.close();
        br.close();
    }
}
