import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> files = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String fileName = br.readLine();

            String[] parts = fileName.split("\\.");
            files.put(parts[1], files.getOrDefault(parts[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : files.entrySet()) {
          String extension = entry.getKey();
          int cnt = entry.getValue();
          sb.append(extension).append(" ").append(String.valueOf(cnt)).append("\n");
        }

        System.out.println(sb.toString());
    }
}