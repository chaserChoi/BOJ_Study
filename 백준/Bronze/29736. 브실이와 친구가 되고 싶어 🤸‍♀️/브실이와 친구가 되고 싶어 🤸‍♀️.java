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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int minFriend = Math.max(A, K - X);
        int maxFriend = Math.min(B, K + X);

        int possibleFriends = maxFriend - minFriend + 1;

        if (possibleFriends <= 0) bw.write("IMPOSSIBLE");
        else bw.write(String.valueOf(possibleFriends));

        br.close();
        bw.flush();
        bw.close();
    }
}
