import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1; i * i * i * i * i * i <= b; i++) {
            double cool = Math.pow(i, 6);
            if (cool >= a)
                cnt++;
        }

        System.out.println(cnt);
    }
}

