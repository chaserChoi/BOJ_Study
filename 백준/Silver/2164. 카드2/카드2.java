import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            queue.add(i);

        while (queue.size() > 1) {
            queue.poll();
            if (queue.size() == 1)
                break;
            queue.add(queue.poll());
        }
        sb.append(queue.peek());
        System.out.println(sb.toString());

        br.close();
    }
}
