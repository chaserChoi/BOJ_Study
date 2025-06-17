import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String fileName = br.readLine();
        char[] c = fileName.toCharArray();

        if (n == 1) sb.append(fileName);
        else {
            for (int i = 0; i < n - 1; i++) {
                String fileName2 = br.readLine();
                for (int j = 0; j < fileName.length(); j++) {
                    if (c[j] != fileName2.charAt(j))
                        c[j] = '?';
                }
            }
            for (int i = 0; i < fileName.length(); i++)
                sb.append(c[i]);
        }
        System.out.println(sb);

        br.close();
    }
}
