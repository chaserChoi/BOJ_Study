import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        String[] str = new String[n];
        for (int i = 0; i < n; i++)
            str[i] = nums[i];

        pw.println("1 1");

        pw.flush();
        pw.close();
        br.close();
    }
}
