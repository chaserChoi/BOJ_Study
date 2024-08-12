import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int[] romanV = new int[256];
        romanV['I'] = 1;
        romanV['V'] = 5;
        romanV['X'] = 10;
        romanV['L'] = 50;
        romanV['C'] = 100;
        romanV['D'] = 500;
        romanV['M'] = 1000;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            int year = 0;

            for (char c : line.toCharArray())
                year += romanV[c];

            sb.append(year).append("\n");
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
