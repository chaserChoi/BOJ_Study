import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (char c : str.toCharArray()) {
          if (c >= 'A' && c <= 'Z') {
              c = (char) ((c - 'A' + 13) % 26 + 'A');
          } else if (c >= 'a' && c <= 'z') {
              c = (char) ((c - 'a' + 13) % 26 + 'a');
          }
          sb.append(c);
        }
        System.out.println(sb);

        br.close();
    }
}
