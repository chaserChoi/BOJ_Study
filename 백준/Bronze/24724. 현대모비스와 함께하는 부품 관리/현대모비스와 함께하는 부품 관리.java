import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] limits = br.readLine().split(" ");
            long a = Long.parseLong(limits[0]);
            long b = Long.parseLong(limits[1]);

            List<int[]> parts = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String[] partInfo = br.readLine().split(" ");
                int u = Integer.parseInt(partInfo[0]);
                int v = Integer.parseInt(partInfo[1]);
                parts.add(new int[]{u, v});
            }

            int cnt = 0;
            long curSize = 0;
            long curWeight = 0;

            for (int[] part : parts) {
                int size = part[0];
                int weight = part[1];

                if (curSize + size <= a && curWeight + weight <= b) {
                    curSize += size;
                    curWeight += weight;
                } else {
                    cnt++;
                    curSize = size;
                    curWeight = weight;
                }
            }

            if (curSize > 0 || curWeight > 0)
                cnt++;

            pw.println("Material Management " + i);
            pw.println("Classification ---- End!");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
