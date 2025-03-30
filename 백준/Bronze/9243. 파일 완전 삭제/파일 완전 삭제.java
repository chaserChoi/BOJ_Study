import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String original = br.readLine();
        String deleted = br.readLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char bit = original.charAt(i);
            char newBit = (n % 2 == 0) ? bit : (bit == '0' ? '1' : '0');
            result.append(newBit);
        }

        if (result.toString().equals(deleted))
            System.out.println("Deletion succeeded");
        else
            System.out.println("Deletion failed");
    }
}
