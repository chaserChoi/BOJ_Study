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

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int korean = 0, math = 0, english = 0, research = 0, secondLanguage = 0;

        for (int i = 0; i < T; i++) {
            int score = Integer.parseInt(st.nextToken());
            switch (i) {
                case 0: korean = score; break;
                case 1: math = score; break;
                case 2: english = score; break;
                case 3: research = score; break;
                case 4: secondLanguage = score; break;
            }
        }

        long sum = 0;

        if (korean > english) sum += (korean - english) * 508;
        else sum += (english - korean) * 108;

        if (math > research) sum += (math - research) * 212;
        else sum += (research - math) * 305;

        if (secondLanguage > 0) sum += secondLanguage * 707;

        sum *= 4763;

        bw.write(String.valueOf(sum));

        bw.flush();
        br.close();
        bw.close();
    }
}
