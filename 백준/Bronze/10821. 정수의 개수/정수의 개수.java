import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String[] nums = str.split(",");

        int cnt = nums.length;

        bw.write(String.valueOf(cnt));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
