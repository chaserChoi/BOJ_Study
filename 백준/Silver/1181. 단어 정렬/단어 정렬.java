import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words.add(word);
        }

        List<String> sorted = new ArrayList<>(words);
        sorted.sort((o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            return o1.length() - o2.length();
        });

        for (String s : sorted) 
          sb.append(s).append("\n");

        System.out.println(sb);

        br.close();
    }
}
