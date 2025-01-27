import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");

            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == 4)
                    words[j] = "****";
            }

            sb.append(String.join(" ", words)).append("\n");
            if (i < n - 1)
                sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}

