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

        int[] p = new int[4];
        for (int i = 0; i < 4; i++) p[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        
        int collisionPerson = 0;
        for (int i = 0; i < 4; i++) {
            if (p[i] == x) {
                collisionPerson = i + 1;
                break;
            }
        }

        bw.write(String.valueOf(collisionPerson));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
