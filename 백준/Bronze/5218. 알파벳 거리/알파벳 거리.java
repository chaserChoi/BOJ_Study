import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String line = br.readLine().trim();
            String[] words = line.split(" ");

            String word1 = words[0];
            String word2 = words[1];
            StringBuilder dist = new StringBuilder("Distances: ");

            for (int j = 0; j < word1.length(); j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                int d = calcDistance(c1, c2);
                dist.append(d).append(" ");
            }

            sb.append(dist.toString().trim()).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int calcDistance(char c1, char c2) {
        int pos1 = c1 - 'A' + 1;
        int pos2 = c2 - 'A' + 1;

        if (pos1 <= pos2)
            return pos2 - pos1;
        else
            return (pos2 + 26) - pos1;
    }
}
