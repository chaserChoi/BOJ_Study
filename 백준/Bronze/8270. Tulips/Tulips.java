import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> tulips = new HashSet<>();

        String[] tulipNums = br.readLine().split(" ");

        for (String num : tulipNums) {
            int id = Integer.parseInt(num);
            tulips.add(id);
        }

        int total = 15000;
        int existing = tulips.size();
        int missing = total - existing;

        System.out.println(missing);
    }
}
