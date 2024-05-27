import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        int diff1 = b - a;
        int diff2 = c - b;

        int missingNumber;

        if (diff1 == diff2) missingNumber = c + diff1;
        else if (diff1 < diff2) missingNumber = b + diff1;
        else missingNumber = a + diff2;

        bw.write(missingNumber + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
