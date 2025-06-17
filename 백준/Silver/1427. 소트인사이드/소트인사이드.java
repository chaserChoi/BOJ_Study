import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            char[] arr = line.toCharArray();
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--)
                sb.append(arr[i]);
        }
        System.out.println(sb.toString());

        br.close();
    }
}
