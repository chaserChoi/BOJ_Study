import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> lines = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null)
            lines.add(line.length());

        int max = 0;
        if (!lines.isEmpty())
            max = Collections.max(lines);

        if (!lines.isEmpty())
            lines.remove(lines.size() - 1);

        long result = 0;
        for (Integer l : lines) {
          long diff = max - l;
          result += diff * diff;
        }

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}