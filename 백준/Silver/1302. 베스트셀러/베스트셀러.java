import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> books = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String maxKey = "";

        for (String s : books.keySet()) {
          if (books.get(s) > max) {
              max = books.get(s);
              maxKey = s;
          } else if (books.get(s) == max) {
              if (s.compareTo(maxKey) < 0) {
                  maxKey = s;
              }
          }
        }

        sb.append(maxKey);
        System.out.println(sb.toString());
    }
}