import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] months = new int[13];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            String birthDate = st.nextToken();
            String[] dateParts = birthDate.split("/");
            int month = Integer.parseInt(dateParts[1]);
            months[month]++;
        }

        for (int i = 1; i <= 12; i++)
            System.out.println(i + " " + months[i]);
    }
}
