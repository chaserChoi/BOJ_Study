import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        map.put("R", 45);
        map.put("G", 30);
        map.put("B", 20);
        map.put("Y", 15);
        map.put("O", 10);
        map.put("W", 5);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double price = Double.parseDouble(st.nextToken());
            String color = st.nextToken();
            String coupon = st.nextToken();
            String payment = st.nextToken();

            double currPrice = price;

            currPrice -= (currPrice * map.get(color) / 100);
            currPrice = Math.round(currPrice * 100) / 100.0;

            currPrice -= coupon.equals("C") ? currPrice * 5 / 100 : 0;
            currPrice = Math.round(currPrice * 100) / 100.0;

            if (payment.equals("C")) {
                int secondDecimal = (int) (currPrice * 100 % 10);

                if (secondDecimal >= 6)
                    currPrice = Math.round(currPrice);
                else
                    currPrice = (currPrice * 100 - secondDecimal) / 100.0;
            }

            sb.append(String.format("$%.2f\n", currPrice));
        }
        System.out.print(sb);

        br.close();
    }
}