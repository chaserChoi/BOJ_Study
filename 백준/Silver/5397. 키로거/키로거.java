import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String pwd = br.readLine();

            Deque<Character> left = new ArrayDeque<>();
            Deque<Character> right = new ArrayDeque<>();

            for (char c : pwd.toCharArray()) {
              switch (c) {
                  case '<':
                      if (!left.isEmpty())
                          right.push(left.pop());
                      break;
                  case '>':
                      if (!right.isEmpty())
                          left.push(right.pop());
                      break;
                  case '-':
                      if (!left.isEmpty())
                          left.pop();
                      break;
                  default:
                      left.push(c);
                      break;
              }
            }

            while (!left.isEmpty()) sb.append(left.removeLast());
            while (!right.isEmpty()) sb.append(right.removeFirst());
            sb.append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
