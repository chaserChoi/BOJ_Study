import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split("\\s+");
            int l = words.length;

            map.put(l, map.getOrDefault(l, 0) + 1);
        }

        for (int i : map.keySet())
            System.out.println(i + " " + map.get(i));
    }
}
