import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            if (str.length() > max)
                max = str.length();

            for (int j = 0; j < str.length(); j++)
                arr[i][j] = str.charAt(j);
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0')
                    continue;
                bw.write(arr[j][i]);
            }
        }
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
