import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cntT = 0;
        int cntS = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (char c : line.toCharArray()) {
                if (c == 't' || c == 'T')
                    cntT++;
                else if (c == 's' || c == 'S')
                    cntS++;
            }
        }

        if (cntT > cntS)
            System.out.println("English");
        else
            System.out.println("French");
    }
}

