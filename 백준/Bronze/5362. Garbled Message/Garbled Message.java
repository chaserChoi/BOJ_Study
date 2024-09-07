import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            while (line.contains("iiing")) {
                int index = line.indexOf("iiing");
                line = line.substring(0, index) + "th" + line.substring(index + 5);
            }
            sb.append(line).append("\n");
        }

        pw.print(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
