import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        sb.append("<");
        while (true) {
            if (queue.isEmpty())
                break;
            for (int i = 1; i <= k; i++) {
                if (i != k) {
                    queue.add(queue.poll());
                } else {
                    sb.append(queue.poll());
                    break;
                }
            }
            if (!queue.isEmpty())
                sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb.toString());

        br.close();
    }
}
