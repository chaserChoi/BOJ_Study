import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String plate = br.readLine();
            String[] parts = plate.split("-");
            String let = parts[0];
            String num = parts[1];

            int letVal = 0;
            for (int j = 0; j < let.length(); j++) {
                letVal *= 26;
                letVal += (let.charAt(j) - 'A');
            }

            int numVal = Integer.parseInt(num);

            if (Math.abs(letVal - numVal) <= 100) 
                sb.append("nice\n");
            else
                sb.append("not nice\n");
        }

        pw.print(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
