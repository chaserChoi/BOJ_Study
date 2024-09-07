import java.io.*;
import java.util.*;

public class Main {
    static Map<List<String>, Integer> map = new HashMap<>();

    static {
        map.put(Arrays.asList("..#####..", ".##...##.", "##.....##", "##.....##", "##.....##", ".##...##.", "..#####..", "........."), 0);
        map.put(Arrays.asList("....##...", "..####...", "....##...", "....##...", "....##...", "....##...", "..######.", "........."), 1);
        map.put(Arrays.asList(".#######.", "##.....##", ".......##", ".#######.", "##.......", "##.......", "#########", "........."), 2);
        map.put(Arrays.asList(".#######.", "##.....##", ".......##", ".#######.", ".......##", "##.....##", ".#######.", "........."), 3);
        map.put(Arrays.asList("##.......", "##....##.", "##....##.", "##....##.", "#########", "......##.", "......##.", "........."), 4);
        map.put(Arrays.asList(".########", ".##......", ".##......", ".#######.", ".......##", ".##....##", "..######.", "........."), 5);
        map.put(Arrays.asList(".#######.", "##.....##", "##.......", "########.", "##.....##", "##.....##", ".#######.", "........."), 6);
        map.put(Arrays.asList(".########", ".##....##", ".....##..", "....##...", "...##....", "...##....", "...##....", "........."), 7);
        map.put(Arrays.asList(".#######.", "##.....##", "##.....##", ".#######.", "##.....##", "##.....##", ".#######.", "........."), 8);
        map.put(Arrays.asList(".#######.", "##.....##", "##.....##", ".########", ".......##", "##.....##", ".#######.", "........."), 9);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            List<String> v = new ArrayList<>(8);
            for (int i = 0; i < 8; i++)
                v.add(br.readLine());

            pw.print(map.get(v));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
