import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final Map<Integer, long[]> m = new HashMap<>();

    static {
        m.put(0, new long[]{0, 0, 0});
        m.put(1, new long[]{0, 0, 1});
        m.put(2, new long[]{0, 1, 1});
        m.put(3, new long[]{1, 1, 1});
        m.put(6, new long[]{-1, -1, 2});
        m.put(7, new long[]{0, -1, 2});
        m.put(8, new long[]{0, 0, 2});
        m.put(9, new long[]{0, 1, 2});
        m.put(10, new long[]{1, 1, 2});
        m.put(11, new long[]{-2, -2, 3});
        m.put(12, new long[]{7, 10, -11});
        m.put(15, new long[]{-1, 2, 2});
        m.put(16, new long[]{-511, -1609, 1626});
        m.put(17, new long[]{1, 2, 2});
        m.put(18, new long[]{-1, -2, 3});
        m.put(19, new long[]{0, -2, 3});
        m.put(20, new long[]{1, -2, 3});
        m.put(21, new long[]{-11, -14, 16});
        m.put(24, new long[]{-2901096694L, -15550555555L, 15584139827L});
        m.put(25, new long[]{-1, -1, 3});
        m.put(26, new long[]{0, -1, 3});
        m.put(27, new long[]{0, 0, 3});
        m.put(28, new long[]{0, 1, 3});
        m.put(29, new long[]{1, 1, 3});
        m.put(30, new long[]{-283059965, -2218888517L, 2220422932L});
        m.put(33, new long[]{8866128975287528L, -8778405442862239L, -2736111468807040L});
        m.put(34, new long[]{-1, 2, 3});
        m.put(35, new long[]{0, 2, 3});
        m.put(36, new long[]{1, 2, 3});
        m.put(37, new long[]{0, -3, 4});
        m.put(38, new long[]{1, -3, 4});
        m.put(39, new long[]{117367, 134476, -159380});
        m.put(42, new long[]{-80538738812075974L, 80435758145817515L, 12602123297335631L});
        m.put(43, new long[]{2, 2, 3});
        m.put(44, new long[]{-5, -7, 8});
        m.put(45, new long[]{2, -3, 4});
        m.put(46, new long[]{-2, 3, 3});
        m.put(47, new long[]{6, 7, -8});
        m.put(48, new long[]{-23, -26, 31});
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if (m.containsKey(n)) {
            long[] values = m.get(n);
            pw.println(values[0] + " " + values[1] + " " + values[2]);
        } else
            pw.println("0");

        pw.flush();
        pw.close();
        br.close();
    }
}
