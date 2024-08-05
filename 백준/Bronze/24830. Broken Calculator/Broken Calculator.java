import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        long x = 1;

        while (n-- > 0) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            char op = input[1].charAt(0);
            long b = Long.parseLong(input[2]);

            if (op == '+') 
                x = (a + b) - x;
            else if (op == '-')
                x = (a - b) * x;
            else if (op == '*')
                x = (a * b) * (a * b);
            else
                x = (a % 2 == 1) ? (a + 1) / 2 : a / 2;

            pw.println(x);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
