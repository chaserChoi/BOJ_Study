import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        int leftU = line.indexOf('U');
        int rightF = line.lastIndexOf('F');

        for (int i = 0; i < leftU; i++)
            sb.append('-');

        sb.append('U');

        for (int i = leftU + 1; i < rightF; i++)
            sb.append('C');

        sb.append('F');

        for (int i = rightF + 1; i < line.length(); i++)
            sb.append('-');

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
