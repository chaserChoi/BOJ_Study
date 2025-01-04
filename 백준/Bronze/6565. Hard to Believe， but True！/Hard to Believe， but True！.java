import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String eqation = br.readLine();
            if (eqation.equals("0+0=0")) {
                sb.append("True\n");
                break;
            }

            String[] parts = eqation.split("[+=]");
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];

            String reversedA = new StringBuilder(a).reverse().toString();
            String reversedB = new StringBuilder(b).reverse().toString();
            String reversedC = new StringBuilder(c).reverse().toString();

            int sum = Integer.parseInt(reversedA) + Integer.parseInt(reversedB);
            boolean isTrue = (Integer.parseInt(reversedC) == sum);

            sb.append(isTrue ? "True\n" : "False\n");
        }

        System.out.print(sb);
    }
}
