import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < N; i++) numbers.add(Integer.parseInt(st.nextToken()));

        for (Integer number : numbers) bw.write(number + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
