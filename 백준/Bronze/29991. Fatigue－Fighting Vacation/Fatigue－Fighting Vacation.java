import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int d = Integer.parseInt(line[0]); // 초기 기분
        int c = Integer.parseInt(line[1]); // 지친 활동 수
        int r = Integer.parseInt(line[2]); // 활력을 주는 활동 수

        int[] tiring = new int[c];
        int[] invigorating = new int[r];

        for (int i = 0; i < c; i++)
            tiring[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < r; i++)
            invigorating[i] = Integer.parseInt(br.readLine());

        int total = 0;
        int tirIdx = 0, invIdx = 0;

        while (tirIdx < c || invIdx < r) {
            if (tirIdx < c && d >= tiring[tirIdx]) {
                d -= tiring[tirIdx];
                tirIdx++;
                total++;
            } else if (invIdx < r) {
                d += invigorating[invIdx];
                invIdx++;
                total++;
            } else
                break;
        }

        pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
