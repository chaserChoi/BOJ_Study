import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int num = 1;

        while(true) {

            int n = Integer.parseInt(br.readLine());

            if(n == 0) break;

            String[][] arr = new String[n][n];
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++)
                    arr[i][j] = st.nextToken();
            }

            pw.println("Group " + num);

            int count = 0;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j].equals("N")) {
                        if(i < j)
                            pw.println(arr[n - (j - i)][0] + " was nasty about " + arr[i][0]);
                        else
                            pw.println(arr[i - j][0] + " was nasty about " + arr[i][0]);

                        count = 1;
                    }
                }
            }
            num++;
            if(count == 0)
                pw.println("Nobody was nasty");
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
