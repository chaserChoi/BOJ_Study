import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < 3; l++) {
                    for (int m = 0; m < k; m++) {
                        System.out.print("*x* xx* *".charAt(i * 3 + l));
                    }
                }
                System.out.println();
            }
        }
    }
}

