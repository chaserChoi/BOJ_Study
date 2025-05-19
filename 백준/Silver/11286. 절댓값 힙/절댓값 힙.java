import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2))
                    return o1 - o2;
                else 
                    return Math.abs(o1) - Math.abs(o2);
            }
        });
        
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            
            if (x != 0) 
                pq.add(x);
            else {
                if (pq.isEmpty()) bw.write(0 + "\n");
                else {
                    pq.comparator();
                    bw.write(pq.poll() + "\n");
                }
            }
            
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
