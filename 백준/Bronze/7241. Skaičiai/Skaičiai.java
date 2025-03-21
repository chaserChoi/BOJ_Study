import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int x = Integer.parseInt(br.readLine());

        int[] nums = new int[6];
        nums[0] = 100 * a + 10 * b + c;
        nums[1] = 100 * a + 10 * c + b;
        nums[2] = 100 * b + 10 * a + c;
        nums[3] = 100 * b + 10 * c + a;
        nums[4] = 100 * c + 10 * a + b;
        nums[5] = 100 * c + 10 * b + a;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
