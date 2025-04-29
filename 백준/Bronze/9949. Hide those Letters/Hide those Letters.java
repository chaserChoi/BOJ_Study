import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;
        int caseNum = 0;
        while ((line = br.readLine()) != null && !line.equals("# #")) {
            st = new StringTokenizer(line);
            char target1 = st.nextToken().charAt(0);
            char target2 = st.nextToken().charAt(0);

            caseNum++;

            if (caseNum > 1)
                bw.newLine();

            bw.write("Case " + caseNum);
            bw.newLine();

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String text = br.readLine();
                StringBuilder sb = new StringBuilder();

                for (char c : text.toCharArray()) {
                  char lowerC = Character.toLowerCase(c);
                  char lowerTarget1 = Character.toLowerCase(target1);
                  char lowerTarget2 = Character.toLowerCase(target2);

                  if (lowerC == lowerTarget1 || lowerC == lowerTarget2)
                      bw.append('_');
                  else
                      bw.append(c);
                }

                bw.write(sb.toString());
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}