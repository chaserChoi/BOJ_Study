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

        boolean isChunbae = false;
        boolean isNabi = false;
        boolean isYeongcheol = false;

        for (int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 15; j++) {
                String pixel = st.nextToken();
                if (pixel.equals("w")) isChunbae = true;
                else if (pixel.equals("b")) isNabi = true;
                else if (pixel.equals("g")) isYeongcheol = true;
            }
        }

        if (isChunbae) bw.write("chunbae\n");
        else if (isNabi) bw.write("nabi\n");
        else if (isYeongcheol) bw.write("yeongcheol\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
