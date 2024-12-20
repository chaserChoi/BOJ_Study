import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int z = Integer.parseInt(br.readLine());

        for (int i = 0; i < z; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            String s = input[2];

            for (int j = 0; j < c; j++) {
                String f = s.substring(n) + s;
                s = f;
            }

            System.out.println(s);
        }
    }
}
