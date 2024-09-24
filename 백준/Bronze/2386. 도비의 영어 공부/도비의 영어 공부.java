import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String line;
        while (!(line = br.readLine()).equals("#")) {
            String[] parts = line.split(" ", 2);
            char target = parts[0].charAt(0);
            String sentence = parts[1];

            int cnt = 0;
            for (char c : sentence.toCharArray()) {
                if (Character.toLowerCase(c) == Character.toLowerCase(target))
                    cnt++;
            }

            pw.println(target + " " + cnt);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
