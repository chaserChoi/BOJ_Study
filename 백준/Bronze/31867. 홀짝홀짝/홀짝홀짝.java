import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        String K = br.readLine();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < K.length(); i++) {
            int digit = K.charAt(i) - '0';

            if (digit % 2 == 0) evenCount++;
            else oddCount++;
        }

        if (evenCount > oddCount) bw.write("0\n");
        else if (oddCount > evenCount) bw.write("1\n");
        else bw.write("-1\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
