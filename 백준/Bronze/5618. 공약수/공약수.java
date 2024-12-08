import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(nums[i]);

        List<Integer> list = findCommonDivisors(arr);

        for (int d : list)
            System.out.println(d);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static List<Integer> findCommonDivisors(int[] arr) {
        int gcdVal = arr[0];

        for (int i = 1; i < arr.length; i++)
            gcdVal = gcd(gcdVal, arr[i]);

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(gcdVal); i++) {
            if (gcdVal % i == 0) {
                divisors.add(i);
                if (i != gcdVal / i)
                    divisors.add(gcdVal / i);
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}
